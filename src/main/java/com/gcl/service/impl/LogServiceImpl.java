package com.gcl.service.impl;

import com.gcl.mapper.SysLogMapper;
import com.gcl.model.SysLog;
import com.gcl.service.LogService;
import com.gcl.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description：
 * @author：guoconglin
 * @date：2017/05/25 10:40
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public void insertLog(SysLog sysLog) {
        sysLogMapper.insert(sysLog);
    }

    @Override
    public void findDataGrid(PageInfo pageInfo) {
        pageInfo.setRows(sysLogMapper.findDataGrid(pageInfo));
        pageInfo.setTotal(sysLogMapper.findDataGridCount(pageInfo));
    }
}
