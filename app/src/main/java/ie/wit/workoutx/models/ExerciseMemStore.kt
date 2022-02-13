package ie.wit.workoutx.models

import timber.log.Timber

var lastId = 0L

internal fun getId(): Long {
    return lastId++
}

class ExerciseMemStore : ExerciseStore {

    val donations = ArrayList<ExerciseModel>()

    override fun findAll(): List<ExerciseModel> {
        return donations
    }

    override fun findById(id:Long) : ExerciseModel? {
        val foundExercise: ExerciseModel? = donations.find { it.id == id }
        return foundExercise
    }

    override fun create(exercise: ExerciseModel) {
        exercise.id = getId()
        donations.add(exercise)
        logAll()
    }

    fun logAll() {
        Timber.v("** Donations List **")
        donations.forEach { Timber.v("Donate ${it}") }
    }
}