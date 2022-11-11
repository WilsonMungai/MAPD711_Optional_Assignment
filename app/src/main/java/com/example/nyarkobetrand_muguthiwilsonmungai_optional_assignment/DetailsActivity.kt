package com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.databinding.ActivityDetailsBinding
import com.squareup.picasso.Picasso

class DetailsActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detailsActivityProductTitle = intent.getStringExtra(ListActivity.TITLE_TEXT_INTENT_KEY) ?: ""
        val detailsActivityProductBrand = intent.getStringExtra(ListActivity.BRAND_TEXT_VIEW_INTENT_KEY)
        val detailsActivityProductRating = intent.getStringExtra(ListActivity.RATING_TEXT_VIEW_INTENT_KEY)
        val detailsActivityProductDescription = intent.getStringExtra(ListActivity.DESCRIPTION_TEXT_VIEW_INTENT_KEY)
        val detailsActivityProductImage = intent.getStringExtra(ListActivity.PRODUCT_IMAGE_VIEW_INTENT_KEY)

        title = detailsActivityProductTitle

        Picasso.with(this).load(detailsActivityProductImage).into(binding.detailsActivityImageView)
        binding.detailsActivityTitleTextView.text = detailsActivityProductTitle
        binding.detailsActivityBrandTextView.text = detailsActivityProductBrand
        binding.detailsActivityRatingTextView.text = detailsActivityProductRating
        binding.detailsActivityDescriptionTextView.text = detailsActivityProductDescription


    }
}