package com.github.fjbaldon.inventry

import Admin
import Category
import Item
import Product
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/api/product")
class ProductController(private val service: ProductService) {

    @PostMapping
    fun createProduct(@RequestBody product: Product): ResponseEntity<Product> {
        val savedProduct = service.saveProduct(product)
        return ResponseEntity.created(URI("/${savedProduct.id}")).body(savedProduct)
    }

    @GetMapping
    fun getProducts() = ResponseEntity.ok(service.findProducts())

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: Long): ResponseEntity<Product> =
        service.findProductById(id).toResponseEntity()

    @PutMapping("/{id}")
    fun updateProduct(@PathVariable id: Long, @RequestBody product: Product): ResponseEntity<Product> {
        val updatedProduct = service.saveProduct(product.copy(id = id))
        return ResponseEntity.ok(updatedProduct)
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable id: Long) = service.deleteProduct(id)

    private fun Product?.toResponseEntity(): ResponseEntity<Product> =
        this?.let { ResponseEntity.ok(it) } ?: ResponseEntity.notFound().build()
}

@RestController
@RequestMapping("/api/category")
class CategoryController(private val service: CategoryService) {

    @PostMapping
    fun createCategory(@RequestBody category: Category): ResponseEntity<Category> {
        val savedCategory = service.saveCategory(category)
        return ResponseEntity.created(URI("/${savedCategory.id}")).body(savedCategory)
    }

    @GetMapping
    fun getCategories() = ResponseEntity.ok(service.findCategories())

    @GetMapping("/{id}")
    fun getCategory(@PathVariable id: Long): ResponseEntity<Category> =
        service.findCategoryById(id).toResponseEntity()

    @PutMapping("/{id}")
    fun updateCategory(@PathVariable id: Long, @RequestBody category: Category): ResponseEntity<Category> {
        val updatedCategory = service.saveCategory(category.copy(id = id))
        return ResponseEntity.ok(updatedCategory)
    }

    @DeleteMapping("/{id}")
    fun deleteCategory(@PathVariable id: Long) = service.deleteCategory(id)

    private fun Category?.toResponseEntity(): ResponseEntity<Category> =
        this?.let { ResponseEntity.ok(it) } ?: ResponseEntity.notFound().build()
}

@RestController
@RequestMapping("/api/item")
class ItemController(private val service: ItemService) {

    @PostMapping
    fun createItem(@RequestBody item: Item): ResponseEntity<Item> {
        val savedItem = service.saveItem(item)
        return ResponseEntity.created(URI("/${savedItem.id}")).body(savedItem)
    }

    @GetMapping
    fun getItems() = ResponseEntity.ok(service.findItems())

    @GetMapping("/{id}")
    fun getItem(@PathVariable id: Long): ResponseEntity<Item> =
        service.findItemById(id).toResponseEntity()

    @PutMapping("/{id}")
    fun updateItem(@PathVariable id: Long, @RequestBody item: Item): ResponseEntity<Item> {
        val updatedItem = service.saveItem(item.copy(id = id))
        return ResponseEntity.ok(updatedItem)
    }

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id: Long) = service.deleteItem(id)

    private fun Item?.toResponseEntity(): ResponseEntity<Item> =
        this?.let { ResponseEntity.ok(this) } ?: ResponseEntity.notFound().build()
}

@RestController
@RequestMapping("/api/admin")
class AdminController(private val service: AdminService) {

    @PostMapping
    fun createAdmin(@RequestBody admin: Admin): ResponseEntity<Admin> {
        val savedAdmin = service.saveAdmin(admin)
        return ResponseEntity.created(URI("/${savedAdmin.id}")).body(savedAdmin)
    }

    @GetMapping
    fun getAdmins() = ResponseEntity.ok(service.findAdmins())

    @GetMapping("/{id}")
    fun getAdmin(@PathVariable id: Long): ResponseEntity<Admin> =
        service.findAdminById(id).toResponseEntity()

    @PutMapping("/{id}")
    fun updateAdmin(@PathVariable id: Long, @RequestBody admin: Admin): ResponseEntity<Admin> {
        val updatedAdmin = service.saveAdmin(admin.copy(id = id))
        return ResponseEntity.ok(updatedAdmin)
    }

    @DeleteMapping("/{id}")
    fun deleteAdmin(@PathVariable id: Long) = service.deleteAdmin(id)

    private fun Admin?.toResponseEntity(): ResponseEntity<Admin> =
        this?.let { ResponseEntity.ok(it) } ?: ResponseEntity.notFound().build()
}
