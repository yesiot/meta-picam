SUMMARY = "Image for Rpi0 Camera project"

include recipes-core/images/core-image-base.bb

LICENSE = "MIT"

DISTRO_FEATURES += "wifi"

IMAGE_INSTALL += "\
                 boost\
                 python3\
		 openssh\
"

TOOLCHAIN_TARGET_TASK += "boost-dev"

TOOLCHAIN_HOST_TASK += "nativesdk-cmake"

export IMAGE_BASENAME = "picam-image"

