/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.company.costumer.services;

import az.company.costumer.bean.User;
import az.company.costumer.dao.CostumerDAO;
import az.company.costumer.dao.inter.ICostumerDAO;
import az.company.costumer.inter.ICostumerService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Goshgar
 */
@Service
public class CostumerService implements ICostumerService {

    @Autowired
    @Qualifier(value = "dao3")
    ICostumerDAO costumerDAO;

    @Override
    public String toString() {
        return "CostumerService{" + "costumerDAO=" + costumerDAO + '}';
    }

    @Override
    public List<User> getUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("Goshgar"));
        return list;
    }

}
