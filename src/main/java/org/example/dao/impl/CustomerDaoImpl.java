package org.example.dao.impl;

import org.example.dao.BaseDao;
import org.example.dao.CustomerDao;
import org.example.entity.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public Customer saveCustomer(Customer customer) {
        String sql = "INSERT INTO customer(name, surname, phone, address_id) VALUES (?, ?, ?, ?)";
        ResultSet resultSet;
        try (PreparedStatement ps = BaseDao.connect().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getSurname());
            ps.setInt(3, customer.getPhone());
            ps.setLong(4, customer.getAddress().getId());
            ps.executeUpdate();

            resultSet = ps.getGeneratedKeys();
            if(resultSet.next())
                customer.setId(resultSet.getLong("id"));

            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}