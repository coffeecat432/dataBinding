package com.amigo.databinding

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.amigo.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1번 방식 - findViewById를 이용하는 방식
        //val btn = findViewById<Button>(R.id.testBtnId)
        //btn.setOnClickListener{
        //    Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        //}



        //2번 방식 - Databinding
        // 배달의 민족 채용공고에서도 MVVM패턴으로 아키텍처 구조를 사용하는 것을 원한다.
        // 즉, findViewById로 만들수 있어도, Databinding으로 만드는 것이 트렌드에 맞게 따라가는 것이다.
        // 그리고 작성되는 코드의 양이 줄어들어 유지.보수가 유리하다는 장점도 있다.
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.testBtnId.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }


    }
}