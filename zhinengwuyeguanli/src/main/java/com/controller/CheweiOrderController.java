package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.CheweiOrderEntity;

import com.service.CheweiOrderService;
import com.entity.view.CheweiOrderView;
import com.service.CheweiService;
import com.entity.CheweiEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 车位订单
 * 后端接口
 * @author
 * @email
 * @date 2021-04-29
*/
@RestController
@Controller
@RequestMapping("/cheweiOrder")
public class CheweiOrderController {
    private static final Logger logger = LoggerFactory.getLogger(CheweiOrderController.class);

    @Autowired
    private CheweiOrderService cheweiOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private CheweiService cheweiService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = cheweiOrderService.queryPage(params);

        //字典表数据转换
        List<CheweiOrderView> list =(List<CheweiOrderView>)page.getList();
        for(CheweiOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        CheweiOrderEntity cheweiOrder = cheweiOrderService.selectById(id);
        if(cheweiOrder !=null){
            //entity转view
            CheweiOrderView view = new CheweiOrderView();
            BeanUtils.copyProperties( cheweiOrder , view );//把实体数据重构到view中

            //级联表
            CheweiEntity chewei = cheweiService.selectById(cheweiOrder.getCheweiId());
            if(chewei != null){
                BeanUtils.copyProperties( chewei , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setCheweiId(chewei.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(cheweiOrder.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody CheweiOrderEntity cheweiOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,cheweiOrder:{}",this.getClass().getName(),cheweiOrder.toString());
        cheweiOrder.setInsertTime(new Date());
        cheweiOrder.setCreateTime(new Date());
        cheweiOrderService.insert(cheweiOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody CheweiOrderEntity cheweiOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,cheweiOrder:{}",this.getClass().getName(),cheweiOrder.toString());
        CheweiOrderEntity oldCheweiOrder = cheweiOrderService.selectById(cheweiOrder.getId());//原先的数据
        if(oldCheweiOrder.getCheweiOrderYesNoTypes() != 3 && cheweiOrder.getCheweiOrderYesNoTypes() == 3){//订单由不同意,改为同意,才会修改车位状态为已使用
            CheweiEntity cheweiEntity = cheweiService.selectById(cheweiOrder.getCheweiId());
            if(cheweiEntity == null){
                return R.error(511,"查不到车位");
            }
            if(cheweiEntity.getCheweiTypes() ==2){
                return R.error(511,"车位已被使用");
            }
            cheweiEntity.setCheweiTypes(2);
            cheweiService.updateById(cheweiEntity);//更新车位状态
        }
        cheweiOrderService.updateById(cheweiOrder);//根据id更新
        return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        cheweiOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = cheweiOrderService.queryPage(params);

        //字典表数据转换
        List<CheweiOrderView> list =(List<CheweiOrderView>)page.getList();
        for(CheweiOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        CheweiOrderEntity cheweiOrder = cheweiOrderService.selectById(id);
            if(cheweiOrder !=null){
                //entity转view
                CheweiOrderView view = new CheweiOrderView();
                BeanUtils.copyProperties( cheweiOrder , view );//把实体数据重构到view中

                //级联表
                    CheweiEntity chewei = cheweiService.selectById(cheweiOrder.getCheweiId());
                if(chewei != null){
                    BeanUtils.copyProperties( chewei , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setCheweiId(chewei.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(cheweiOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody CheweiOrderEntity cheweiOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,cheweiOrder:{}",this.getClass().getName(),cheweiOrder.toString());
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
            CheweiEntity cheweiEntity = cheweiService.selectById(cheweiOrder.getCheweiId());
            if(cheweiEntity == null){
                return R.error(511,"查不到车位");
            }
            Integer cheweiTypes = cheweiEntity.getCheweiTypes();
            if(cheweiTypes == 2){
                return R.error(511,"车位已被使用");
            }
            cheweiOrder.setCreateTime(new Date());
            cheweiOrder.setInsertTime(new Date());
            cheweiOrder.setCheweiOrderYesNoTypes(1);
            cheweiOrderService.insert(cheweiOrder);//根据id更新
            return R.ok();
        }else{
            return R.error(511,"您没有权限支付订单");
        }
    }





}

