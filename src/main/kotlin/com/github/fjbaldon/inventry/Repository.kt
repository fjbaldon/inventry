package com.github.fjbaldon.inventry

import Admin
import Category
import Item
import Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long>

interface CategoryRepository : CrudRepository<Category, Long>

interface ItemRepository : CrudRepository<Item, Long>

interface AdminRepository : CrudRepository<Admin, Long>