/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.company.costumer.inter;

import az.company.costumer.bean.User;
import java.util.List;

/**
 *
 * @author Goshgar
 */
public interface ICostumerService {

    public List<User> getUsers();
}
