package com.ssvd.giftregister

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ssvd.giftregister.ui.event.EventDetailScreen
import com.ssvd.giftregister.ui.event.EventListScreen
import com.ssvd.giftregister.ui.gift.GiftDetailScreen
import com.ssvd.giftregister.ui.gift.GiftListScreen
import com.ssvd.sstheme.route.Root
import com.ssvd.sstheme.route.Route




fun NavGraphBuilder.homeGraph(){
    giftGraph()
    eventGraph()
}

fun NavGraphBuilder.eventGraph() {

    navigation(startDestination = Route.Home.EVENT.LIST,route= Root.Home.EVENTS){
                composable(Route.Home.EVENT.LIST){
                    EventListScreen()
                }
                composable(Route.Home.EVENT.MANAGE_EVENT){
                    EventDetailScreen()
                }
    }


}
fun NavGraphBuilder.giftGraph(){
    navigation(startDestination = Route.Home.GIFT.LIST, route = Root.Home.GIFTS){
        composable(Route.Home.GIFT.LIST){
            GiftListScreen()
        }
        composable(Route.Home.GIFT.MANAGE_GIFT){
            GiftDetailScreen()
        }
    }
}