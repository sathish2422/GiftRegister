package com.ssvd.authentication

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ssvd.authentication.ui.forget.ForgetPassword
import com.ssvd.authentication.ui.login.LoginScreen
import com.ssvd.authentication.ui.regester.RegisterScreen
import com.ssvd.sstheme.route.Root
import com.ssvd.sstheme.route.Route

fun NavGraphBuilder.authNavGraph(){
            navigation(startDestination = Root.Auth.LOGIN, route=Root.AUTH ){
            composable(Route.Auth.REGISTER){
                RegisterScreen()
            }
                loginNavGraph()
            }
}

fun NavGraphBuilder.loginNavGraph() {
            navigation(startDestination = Route.Auth.Login.LOGIN, route = Root.Auth.LOGIN){
                composable(Route.Auth.Login.LOGIN) {
                    LoginScreen()
                }
                composable(Route.Auth.Login.FORGET_PASSWORD) {
                    ForgetPassword()
                }
            }
}
