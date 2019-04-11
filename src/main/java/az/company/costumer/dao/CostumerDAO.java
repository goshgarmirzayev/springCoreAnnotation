/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.company.costumer.dao;

import az.company.costumer.bean.User;
import az.company.costumer.dao.inter.ICostumerDAO;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Goshgar
 */
@Repository(value = "dao3")
public class CostumerDAO implements ICostumerDAO {

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public String toString() {
        return "This is CostumerDAO";
    }

}
