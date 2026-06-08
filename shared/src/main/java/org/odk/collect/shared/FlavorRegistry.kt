package org.odk.collect.shared

/**
 * A central hub for flavor-specific data.
 * The App module will fill these values on startup.
 */
object FlavorRegistry {
    var offlineLayersUrl: String = "https://default.url"
    var qrFolderUrl: String = "https://default.url"
    var idPrefix: String = "default"
    var showTrackLocation: Boolean = true
    var showFormVersion: Boolean = true
    var showFormId: Boolean = true
    var showAboutButton: Boolean = true
    var defaultToLatestSaved: Boolean = true
    var showVerionSha: Boolean = true
}