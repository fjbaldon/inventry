package com.github.fjbaldon.inventry

import Admin
import Category
import Item
import Product
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProductService(private val db: ProductRepository) {

    fun saveProduct(product: Product): Product = db.save(product)

    fun findProducts(): List<Product> = db.findAll().toList()

    fun findProductById(id: Long): Product? = db.findByIdOrNull(id)

    fun deleteProduct(id: Long) = db.deleteById(id)
}

@Service
class CategoryService(private val db: CategoryRepository) {

    fun saveCategory(category: Category): Category = db.save(category)

    fun findCategories(): List<Category> = db.findAll().toList()

    fun findCategoryById(id: Long): Category? = db.findByIdOrNull(id)

    fun deleteCategory(id: Long) = db.deleteById(id)
}

@Service
class ItemService(private val db: ItemRepository) {

    fun saveItem(item: Item): Item = db.save(item)

    fun findItems(): List<Item> = db.findAll().toList()

    fun findItemById(id: Long): Item? = db.findByIdOrNull(id)

    fun deleteItem(id: Long) = db.deleteById(id)
}

@Service
class AdminService(private val db: AdminRepository) {

    fun saveAdmin(admin: Admin): Admin = db.save(admin)

    fun findAdmins(): List<Admin> = db.findAll().toList()

    fun findAdminById(id: Long): Admin? = db.findByIdOrNull(id)

    fun deleteAdmin(id: Long) = db.deleteById(id)
}