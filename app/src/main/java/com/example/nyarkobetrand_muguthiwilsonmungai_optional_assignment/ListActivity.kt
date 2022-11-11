package com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.lifecycle.ViewModelProvider
import com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.databinding.ActivityListBinding
import com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.model.FragranceResponse
import com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.viewModel.ListActivityViewModel
import com.squareup.picasso.Picasso

class ListActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityListBinding
    private lateinit var viewModel:ListActivityViewModel

    private var fragranceList = emptyList<FragranceResponse>()

    companion object
    {
        const val TITLE_TEXT_INTENT_KEY = "TITLE_TEXT_INTENT_KEY"
        const val BRAND_TEXT_VIEW_INTENT_KEY = "BRAND_TEXT_VIEW"
        const val RATING_TEXT_VIEW_INTENT_KEY = "RATING_TEXT_VIEW"
        const val DESCRIPTION_TEXT_VIEW_INTENT_KEY = "DESCRIPTION_TEXT_VIEW"
        const val PRODUCT_IMAGE_VIEW_INTENT_KEY = "IMAGE_VIEW"
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ListActivityViewModel::class.java]
        viewModel.getFragrance()

        viewModel.fragranceLiveData?.observe(this) { fragrances ->

            fragranceList = fragrances.products

            binding.card1.titleTextView.text = fragrances.products[0].title
            binding.card2.titleTextView.text = fragrances.products[1].title
            binding.card3.titleTextView.text = fragrances.products[2].title
            binding.card4.titleTextView.text = fragrances.products[3].title
            binding.card5.titleTextView.text = fragrances.products[4].title

            binding.card1.brandTextView.text = fragrances.products[0].brand
            binding.card2.brandTextView.text = fragrances.products[1].brand
            binding.card3.brandTextView.text = fragrances.products[2].brand
            binding.card4.brandTextView.text = fragrances.products[3].brand
            binding.card5.brandTextView.text = fragrances.products[4].brand

            binding.card1.ratingTextView.text = fragrances.products[0].rating.toString()
            binding.card2.ratingTextView.text = fragrances.products[1].rating.toString()
            binding.card3.ratingTextView.text = fragrances.products[2].rating.toString()
            binding.card4.ratingTextView.text = fragrances.products[3].rating.toString()
            binding.card5.ratingTextView.text = fragrances.products[4].rating.toString()

            binding.card1.descriptionTextView.text = fragrances.products[0].description
            binding.card2.descriptionTextView.text = fragrances.products[1].description
            binding.card3.descriptionTextView.text = fragrances.products[2].description
            binding.card4.descriptionTextView.text = fragrances.products[3].description
            binding.card5.descriptionTextView.text = fragrances.products[4].description

            Picasso.with(this).load(fragrances.products[0].thumbnail).into(binding.card1.fragranceImage)
            Picasso.with(this).load(fragrances.products[1].thumbnail).into(binding.card2.fragranceImage)
            Picasso.with(this).load(fragrances.products[2].thumbnail).into(binding.card3.fragranceImage)
            Picasso.with(this).load(fragrances.products[3].thumbnail).into(binding.card4.fragranceImage)
            Picasso.with(this).load(fragrances.products[4].thumbnail).into(binding.card5.fragranceImage)
        }

        binding.card1.viewDetailsButton.setOnClickListener{
            startActivity(
                Intent(this, DetailsActivity::class.java)
                .putExtra(TITLE_TEXT_INTENT_KEY, fragranceList[0].title)
                .putExtra(BRAND_TEXT_VIEW_INTENT_KEY,fragranceList[0].brand)
                .putExtra(RATING_TEXT_VIEW_INTENT_KEY,fragranceList[0].rating.toString())
                .putExtra(DESCRIPTION_TEXT_VIEW_INTENT_KEY,fragranceList[0].description)
                .putExtra(PRODUCT_IMAGE_VIEW_INTENT_KEY, fragranceList[0].images[0])
            )
        }
        binding.card2.viewDetailsButton.setOnClickListener{
            startActivity(
                Intent(this, DetailsActivity::class.java)
                    .putExtra(TITLE_TEXT_INTENT_KEY, fragranceList[1].title)
                    .putExtra(BRAND_TEXT_VIEW_INTENT_KEY,fragranceList[1].brand)
                    .putExtra(RATING_TEXT_VIEW_INTENT_KEY,fragranceList[1].rating.toString())
                    .putExtra(DESCRIPTION_TEXT_VIEW_INTENT_KEY,fragranceList[1].description)
                    .putExtra(PRODUCT_IMAGE_VIEW_INTENT_KEY, fragranceList[1].images[1])
            )
        }
        binding.card3.viewDetailsButton.setOnClickListener{
            startActivity(
                Intent(this, DetailsActivity::class.java)
                    .putExtra(TITLE_TEXT_INTENT_KEY, fragranceList[2].title)
                    .putExtra(BRAND_TEXT_VIEW_INTENT_KEY,fragranceList[2].brand)
                    .putExtra(RATING_TEXT_VIEW_INTENT_KEY,fragranceList[2].rating.toString())
                    .putExtra(DESCRIPTION_TEXT_VIEW_INTENT_KEY,fragranceList[2].description)
                    .putExtra(PRODUCT_IMAGE_VIEW_INTENT_KEY, fragranceList[2].images[2])
            )
         }
        binding.card4.viewDetailsButton.setOnClickListener{
            startActivity(
                Intent(this, DetailsActivity::class.java)
                    .putExtra(TITLE_TEXT_INTENT_KEY, fragranceList[3].title)
                    .putExtra(BRAND_TEXT_VIEW_INTENT_KEY,fragranceList[3].brand)
                    .putExtra(RATING_TEXT_VIEW_INTENT_KEY,fragranceList[3].rating.toString())
                    .putExtra(DESCRIPTION_TEXT_VIEW_INTENT_KEY,fragranceList[3].description)
                    .putExtra(PRODUCT_IMAGE_VIEW_INTENT_KEY, fragranceList[3].images[3])
            )
        }
        binding.card5.viewDetailsButton.setOnClickListener{
            startActivity(
                Intent(this, DetailsActivity::class.java)
                    .putExtra(TITLE_TEXT_INTENT_KEY, fragranceList[4].title)
                    .putExtra(BRAND_TEXT_VIEW_INTENT_KEY,fragranceList[4].brand)
                    .putExtra(RATING_TEXT_VIEW_INTENT_KEY,fragranceList[4].rating.toString())
                    .putExtra(DESCRIPTION_TEXT_VIEW_INTENT_KEY,fragranceList[4].description)
                    .putExtra(PRODUCT_IMAGE_VIEW_INTENT_KEY, fragranceList[4].images[4])
            )
        }
    }
}