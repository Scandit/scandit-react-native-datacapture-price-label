/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2020- Scandit AG. All rights reserved.
 */
package com.scandit.datacapture.reactnative.price.label

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.scandit.datacapture.reactnative.core.ScanditReactPackageBase

class ScanditDataCapturePriceLabelPackage : ScanditReactPackageBase() {
    override fun createNativeModules(
        reactContext: ReactApplicationContext
    ): MutableList<NativeModule> = mutableListOf(ScanditDataCapturePriceLabelModule(reactContext))

    override fun createViewManagers(
        reactContext: ReactApplicationContext
    ): MutableList<ViewManager<*, *>> = mutableListOf()

    override fun getModuleClasses(): List<Class<out NativeModule>> =
        listOf(ScanditDataCapturePriceLabelModule::class.java)
}
