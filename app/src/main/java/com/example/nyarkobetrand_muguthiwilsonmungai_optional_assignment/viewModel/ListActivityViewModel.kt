package com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.model.FragrancesResponse
import com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.network.FragranceService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListActivityViewModel: ViewModel()
{
    var fragranceLiveData: MutableLiveData<FragrancesResponse>? = null

    init
    {
        if (fragranceLiveData == null)
        {
            fragranceLiveData = MutableLiveData()
        }
    }

    fun getFragrance()
    {
        viewModelScope.launch (Dispatchers.IO)
        {
            val data = FragranceService.retrofit.getFragrances()
            fragranceLiveData?.postValue(data)
        }
    }
}