package ie.wit.workoutx.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ExerciseModel(var id: Long = 0,
                         val workoutName: String = "",
                         val workoutType: String = "N/A",
                         val workoutDuration: String = "") : Parcelable