package com.example.scoreup.auth

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.scoreup.R
import com.example.scoreup.admin.dashboard.AdminDashboardActivity
import com.example.scoreup.admin.dashboard.TeacherDashboardActivity
import com.example.scoreup.admin.dashboard.StudentDashboardActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val spinner = findViewById<Spinner>(R.id.spRole)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            val role = spinner.selectedItem.toString()

            when {
                username == "admin" && password == "123" && role == "Admin" ->
                    startActivity(Intent(this, AdminDashboardActivity::class.java))

                username == "teacher" && password == "123" && role == "Teacher" ->
                    startActivity(Intent(this, TeacherDashboardActivity::class.java))

                username == "student" && password == "123" && role == "Student" ->
                    startActivity(Intent(this, StudentDashboardActivity::class.java))

                else ->
                    Toast.makeText(this, "Invalid login", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
