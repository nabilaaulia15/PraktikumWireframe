package com.example.praktikumwireframe

data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val colorRes: Int
)

object FoodData {
    val foodList = listOf(
        FoodItem(
            1,
            "Burger Double Beef",
            "2 patty daging sapi premium dengan keju cheddar meleleh",
            "Rp 35.000",
            R.color.burgerRed
        ),
        FoodItem(
            2,
            "Crispy Chicken Burger",
            "Ayam crispy renyah dengan saus mayo special",
            "Rp 28.000",
            R.color.ketchupOrange
        ),
        FoodItem(
            3,
            "Cheese Burger Jumbo",
            "Burger jumbo dengan 3 lapis keju mozzarella",
            "Rp 40.000",
            R.color.cheeseGold
        ),
        FoodItem(
            4,
            "French Fries XXL",
            "Kentang goreng crispy ukuran extra large",
            "Rp 20.000",
            R.color.friesYellow
        ),
        FoodItem(
            5,
            "Chicken Wings 8pcs",
            "Sayap ayam crispy dengan saus BBQ/pedas",
            "Rp 32.000",
            R.color.ketchupOrange
        ),
        FoodItem(
            6,
            "Onion Rings Special",
            "Bawang bombay goreng tepung dengan saus cheese",
            "Rp 18.000",
            R.color.mustardYellow
        ),
        FoodItem(
            7,
            "Hot Dog Supreme",
            "Sosis jumbo dengan topping keju dan saus",
            "Rp 25.000",
            R.color.burgerRed
        ),
        FoodItem(
            8,
            "Veggie Burger",
            "Burger sayuran fresh dengan saus thousand island",
            "Rp 24.000",
            R.color.lettuceGreen
        ),
        FoodItem(
            9,
            "Chicken Nuggets 12pcs",
            "Nugget ayam original crispy dengan saus pilihan",
            "Rp 30.000",
            R.color.cheeseGold
        ),
        FoodItem(
            10,
            "BBQ Beef Burger",
            "Beef burger dengan saus BBQ smokey dan bacon",
            "Rp 38.000",
            R.color.colaBlack
        ),
        FoodItem(
            11,
            "Spicy Chicken Wrap",
            "Tortilla wrap dengan ayam pedas dan sayuran segar",
            "Rp 27.000",
            R.color.burgerRed
        ),
        FoodItem(
            12,
            "Fish Fillet Burger",
            "Fillet ikan dori crispy dengan tartar sauce",
            "Rp 33.000",
            R.color.lettuceGreen
        )
    )
}
