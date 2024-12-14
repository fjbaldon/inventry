import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("product")
data class Product(
    @Id val id: Long? = null,
    val name: String,
    val description: String,
    val price: Double
)

@Table("category")
data class Category(
    @Id val id: Long? = null,
    val name: String
)

@Table("item")
data class Item(
    @Id val id: Long? = null,
    val productId: Long,
    val categoryId: Long,
    val quantityInStock: Int,
    val warehouseLocation: String
)

@Table("admin")
data class Admin(
    @Id val id: Long? = null,
    val username: String,
    val password: String
)
