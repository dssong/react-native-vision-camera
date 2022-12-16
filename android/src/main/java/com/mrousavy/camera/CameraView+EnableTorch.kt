package com.mrousavy.camera

suspend fun CameraView.enableTorch(status: Boolean) {
  val cameraControl = camera?.cameraControl ?: throw CameraNotReadyError()

  cameraControl.enableTorch(status)
}
