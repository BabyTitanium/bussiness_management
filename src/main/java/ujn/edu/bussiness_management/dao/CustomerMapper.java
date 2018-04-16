package ujn.edu.bussiness_management.dao;

import org.apache.ibatis.annotations.Mapper;
import ujn.edu.bussiness_management.model.Customer;

import java.util.List;

@Mapper
public interface CustomerMapper {
    Integer addCustomer(Customer customer);
    Customer selectCustomer(Long id);
    Integer updateCustomer(Customer customer);

}
