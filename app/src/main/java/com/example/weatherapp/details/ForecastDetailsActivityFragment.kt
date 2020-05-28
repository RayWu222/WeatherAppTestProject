package com.example.weatherapp.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.weatherapp.*


class ForecastDetailsActivityFragment : Fragment() {


    private val args: ForecastDetailsActivityFragmentArgs by navArgs()

    private lateinit var tempDisplaySettingManager: TempDisplaySettingManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout =  inflater.inflate(R.layout.fragment_forecast_details, container, false)

        tempDisplaySettingManager = TempDisplaySettingManager(requireContext())
        val tempText = layout.findViewById<TextView>(R.id.tempText)
        val descriptionText = layout.findViewById<TextView>(R.id.descriptionText)


        tempText.text = formatTempForDisplay(args.temp, tempDisplaySettingManager.getTempDisplaySetting())
        descriptionText.text = args.description




        return layout
    }









    }
