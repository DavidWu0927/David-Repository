package cn.bdqn.whcm.dao;

import cn.bdqn.whcm.pojo.Class1;
import cn.bdqn.whcm.pojo.Class1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Class1Mapper {
    int countByExample(Class1Example example);

    int deleteByExample(Class1Example example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Class1 record);

    int insertSelective(Class1 record);

    List<Class1> selectByExample(Class1Example example);

    Class1 selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Class1 record, @Param("example") Class1Example example);

    int updateByExample(@Param("record") Class1 record, @Param("example") Class1Example example);

    int updateByPrimaryKeySelective(Class1 record);

    int updateByPrimaryKey(Class1 record);
}