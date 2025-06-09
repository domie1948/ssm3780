package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.CheweiOrderDao;
import com.entity.CheweiOrderEntity;
import com.service.CheweiOrderService;
import com.entity.view.CheweiOrderView;

/**
 * 车位订单 服务实现类
 * @author 
 * @since 2021-04-29
 */
@Service("cheweiOrderService")
@Transactional
public class CheweiOrderServiceImpl extends ServiceImpl<CheweiOrderDao, CheweiOrderEntity> implements CheweiOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<CheweiOrderView> page =new Query<CheweiOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
