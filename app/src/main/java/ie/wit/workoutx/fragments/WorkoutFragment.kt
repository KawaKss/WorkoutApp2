package ie.wit.workoutx.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ie.wit.workoutx.databinding.FragmentWorkoutBinding
import ie.wit.workoutx.main.WorkoutXApp
import ie.wit.workoutx.models.ExerciseModel


class WorkoutFragment : Fragment() {

    lateinit var app: WorkoutXApp
    private var _fragBinding: FragmentWorkoutBinding? = null
    private val fragBinding get() = _fragBinding!!

    private lateinit var model: ExerciseModel

    //variables
    lateinit var workoutName: String
    lateinit var workoutType: String
    lateinit var workoutDuration: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as WorkoutXApp
        setHasOptionsMenu(true)

        //Receiving model
        val bundle = arguments
        val getModel = bundle?.get("model") as ExerciseModel
        //setting model
        model = getModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _fragBinding = FragmentWorkoutBinding.inflate(inflater, container, false)
        val root = fragBinding.root



        variablesetter()
        videoPlayer()
return root
    }


    private fun videoPlayer(){
        if(workoutType.equals("Chest")){
            //Display Chest video

        }else if(workoutType.equals("Stomach")){
            //Display Stomach video
        }

        else if(workoutType.equals("Shoulders")){
            //Display Shoulders video
        }

        else if(workoutType.equals("Back")){
            //Display Back video
        }

        else if(workoutType.equals("Legs")){
            //Display Legs video
        }

        else if(workoutType.equals("Biceps")){
            //Display Biceps video
        }

        else if(workoutType.equals("Triceps")){
            //Display Triceps video
        }



    }

    //Sets the variables from received model
    private fun variablesetter(){
        workoutName = model.workoutName
        workoutType = model.workoutType
        workoutDuration = model.workoutDuration



    }









    companion object {

        @JvmStatic
        fun newInstance() =
            WorkoutFragment().apply {

            }
    }
}