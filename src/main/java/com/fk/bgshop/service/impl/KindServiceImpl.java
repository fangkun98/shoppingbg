package com.fk.bgshop.service.impl;

import com.fk.bgshop.mapper.KindMapper;
import com.fk.bgshop.pojo.Kind;
import com.fk.bgshop.service.KindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName KindServiceImpl
 * @Description TODO
 * @Date 2020/5/10 17:16
 * @Created by FangKun
 */
@Service
public class KindServiceImpl implements KindService {

    @Resource
    private KindMapper kindMapper;

    @Override
    public List<Kind> getAllKind() {
        return kindMapper.getAllKind();
    }

    @Override
    public Kind getKindById(Integer cate_id) {
        return kindMapper.getKindById(cate_id);
    }

    @Override
    public int delKind(Integer cate_id) {
        return kindMapper.delKind(cate_id);
    }

    @Override
    public int addKind(Kind kind) {
        return kindMapper.addKind(kind);
    }

    @Override
    public int updateKind(Kind kind) {
        return kindMapper.updateKind(kind);
    }

    @Override
    public int deleteSome(Integer[] ids) {
        return kindMapper.deleteSome(ids);
    }
}
