package demo.fruit.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import demo.fruit.mapper.FruitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.fruit.dto.Fruit;
import demo.fruit.service.IFruitService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FruitServiceImpl extends BaseServiceImpl<Fruit> implements IFruitService{
    @Autowired
    private FruitMapper fruitMapper;
    @Override
    public int updateList(List<Fruit> fruitList) {
        fruitList.forEach(fruit -> checkOvn(fruitMapper.myUpdate(fruit),fruit));
        return fruitList.size();
    }




}