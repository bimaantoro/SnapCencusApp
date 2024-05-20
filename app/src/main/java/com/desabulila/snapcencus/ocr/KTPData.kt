package com.desabulila.snapcencus.ocr

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class KTPData(
    var nik: String? = null,
    var nama: String? = null,
    var alamat: String? = null,
    var rtrw: String? = null,
    var keldesa: String? = null,
    var kecamatan: String? = null,
): Parcelable