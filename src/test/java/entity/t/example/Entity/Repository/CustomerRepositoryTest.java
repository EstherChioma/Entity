package entity.t.example.Entity.Repository;

import entity.t.example.Entity.Entity.Customer;
import entity.t.example.Entity.Entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class CustomerRepositoryTest {

    @BeforeEach
    void setUp() {
    }

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    @AfterEach
    void tearDown() {
    }


    @Test
    void findAllOrders() {
    List<Customer> findAllUsers = customerRepository.findAll();
    assertThat(findAllUsers).isNotNull();
    }

    @Test
    void saveCustomer(){

        // create customer object
        Customer customer = new Customer();
        customer.setName("esther");
        customer.setEmail("esther@gmail");
        customer.setGender("male");

        // create product object
        Product product = new Product();
        product.setProductName("rice");
        product.setQty(1);
        product.setPrice(300);

        // map product to customer
        customer.setProducts(List.of(product));

        customerRepository.save(customer);

        assertThat(customer).isNotNull();
    }






}