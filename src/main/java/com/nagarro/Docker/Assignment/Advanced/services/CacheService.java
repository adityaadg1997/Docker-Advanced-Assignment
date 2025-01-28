package com.nagarro.Docker.Assignment.Advanced.services;

import com.nagarro.Docker.Assignment.Advanced.beans.Customer;

public interface CacheService {

    Customer getCache(String key);

    void setCache(String key, Customer customer);

    void clearCache(String key);
}
