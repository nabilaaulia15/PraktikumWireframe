package com.example.praktikumwireframe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.praktikumwireframe.databinding.ActivityHomeBinding
import com.example.praktikumwireframe.databinding.ItemFoodBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var b: ActivityHomeBinding
    private var selectedFoodId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(b.root)

        // Sapaan
        b.tvHalo.text = "Halo ${OrderData.namaUser.ifBlank { "Nazwa" }},"

        // Bersihkan pilihan saat masuk
        OrderData.makananDipilih.clear()

        // Populate food items
        populateFoodItems()

        // Lanjut ke ringkasan
        b.btnKeOrder.setOnClickListener {
            if (OrderData.makananDipilih.isEmpty()) {
                Toast.makeText(this, "Pilih salah satu makanan dulu yaa! 😊", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            startActivity(Intent(this, OrderReviewActivity::class.java))
        }
    }

    private fun populateFoodItems() {
        FoodData.foodList.forEach { food ->
            val itemBinding = ItemFoodBinding.inflate(LayoutInflater.from(this))
            
            // Set data
            itemBinding.tvFoodName.text = food.name
            itemBinding.tvFoodDesc.text = food.description
            itemBinding.tvFoodPrice.text = food.price
            itemBinding.colorIndicator.setBackgroundColor(ContextCompat.getColor(this, food.colorRes))
            
            // Set RadioButton ID
            itemBinding.rbFood.id = food.id
            
            // Add to RadioGroup
            b.rgMakanan.addView(itemBinding.root)
            
            // Handle click on entire card
            itemBinding.root.setOnClickListener {
                itemBinding.rbFood.isChecked = true
                selectedFoodId = food.id
                OrderData.makananDipilih.clear()
                OrderData.makananDipilih.add("${food.name} - ${food.price}")
            }
            
            // Handle RadioButton change
            itemBinding.rbFood.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    selectedFoodId = food.id
                    OrderData.makananDipilih.clear()
                    OrderData.makananDipilih.add("${food.name} - ${food.price}")
                }
            }
        }
    }
}