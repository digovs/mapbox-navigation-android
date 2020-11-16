package com.mapbox.navigation.ui.routealert

import android.content.Context

/**
 * The options for [MapboxRouteAlertsDisplayer] to display route alerts.
 *
 * @param context for retrieving route alert drawable
 * @param showToll support to show [RouteAlertToll] or not
 */
class MapboxRouteAlertsDisplayOptions private constructor(
    val context: Context,
    val showToll: Boolean
) {
    /**
     * @return the builder that created the [MapboxRouteAlertsDisplayOptions]
     */
    fun toBuilder() = Builder(context).apply {
        showToll(showToll)
    }

    /**
     * Override the equals method. Regenerate whenever a change is made.
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MapboxRouteAlertsDisplayOptions

        if (context != other.context) return false
        if (showToll != other.showToll) return false

        return true
    }

    /**
     * Override the hashCode method. Regenerate whenever a change is made.
     */
    override fun hashCode(): Int {
        var result = context.hashCode()
        result = 31 * result + showToll.hashCode()
        return result
    }

    /**
     * Returns a string representation of the object.
     */
    override fun toString(): String {
        return "MapboxRouteAlertsDisplayOptions(" +
            "context=$context, " +
            "showToll=$showToll" +
            ")"
    }

    /**
     * Builder for [MapboxRouteAlertsDisplayOptions]
     */
    class Builder(
        private val context: Context
    ) {
        private var showToll: Boolean = false

        /**
         * Show [RouteAlertToll] or not
         */
        fun showToll(showToll: Boolean) = this.apply {
            this.showToll = showToll
        }

        /**
         * Build the [MapboxRouteAlertsDisplayOptions]
         */
        fun build() = MapboxRouteAlertsDisplayOptions(
            context,
            showToll
        )
    }
}
