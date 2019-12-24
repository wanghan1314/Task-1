package com.ptt.service;

import com.ptt.dao.IRecommendService;
import com.ptt.mapper.ICompanyMapper;
import com.ptt.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: RecommendServiceImpl
 * @Description: The service of page-recommend.
 * @Author: Jin
 * @CreateDate: 2018/5/26 15:38
 * @Version: 1.0
 */
@Service
public class RecommendServiceImpl implements IRecommendService{
    @Autowired
    private ICompanyMapper iCompanyMapper;

    /**
     * @Description: Select all cooperate companies.
     * @return: java.util.List<com.ptt.pojo.Company>
     * @Date: 2018/5/26 15:40
     */
    @Override
    public List<Company> getCompanies() {

        return iCompanyMapper.selectAll();
    }
}
