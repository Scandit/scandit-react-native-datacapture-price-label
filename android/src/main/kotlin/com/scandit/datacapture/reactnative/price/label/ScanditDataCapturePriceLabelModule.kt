/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2020- Scandit AG. All rights reserved.
 */
package com.scandit.datacapture.reactnative.price.label

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = ScanditDataCapturePriceLabelModule.NAME)
class ScanditDataCapturePriceLabelModule(
    reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {

    companion object {
        const val NAME = "ScanditDataCapturePriceLabel"
    }

    override fun getName(): String = NAME
}
