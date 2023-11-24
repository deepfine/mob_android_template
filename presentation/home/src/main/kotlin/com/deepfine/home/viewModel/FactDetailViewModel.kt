package com.deepfine.home.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.deepfine.domain.model.Fact
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Description
 * @author yc.park (DEEP.FINE)
 */
@HiltViewModel
internal class FactDetailViewModel @Inject constructor(
  savedStateHandle: SavedStateHandle
) : ViewModel() {
  val fact: Fact by lazy {
    savedStateHandle[ARG_FACT]!!
  }

  companion object {
    private const val ARG_FACT = "fact"
  }
}