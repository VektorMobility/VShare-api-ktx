package com.vektor.vshare_api_ktx.model

import java.util.*

class MobileParameters(mobileParameterList: HashMap<String, Any>?) {

    var visiblePriceRatio: Double = 0.25

    var durationLimit: Double = 15.0

    var distanceLimit: Double = 150.0

    var force3dPayment: Boolean = true

    var vehicleListRefreshLimitInMeters: Float = 0.toFloat()

    var vehicleListRefreshDurationInMinutes: Int = 0

    var cacheVersion: Double = 0.0

    var vehicleDoorCommandRadius: Double? = null

    var radarSearchMaxDurationInMinutes: Double? = null

    var radarSearchSuccessMinute: Double? = null

    var cameraResolutionAndroid: String = "MEDIUM"

    var digitalAgreementVersion: Int = 20200101

    var isSearchAvailableForUnapprovedUser = true

    var isHomeButtonActive = false

    var isOfficeButtonActive = false

    var isCampusButtonActive = false

    var isZoneButtonActive = false

    var isMallButtonActive = false

    var isCityButtonActive = false

    var maxBillingFreezeTimeInMin: Double? = null

    var minDailyRentalDays: Int = 0

    var maxDailyRentalDays: Int = 0

    var dailyRentalEndNoticeHours: Int = 0

    var showRemainingFreeMinuteForSelfService: Int = 10

    var maxDailyNOfDays: Int = 0

    var maxDailyRequestDays: Int = 0

    var freeWaitingTime: Int = 0

    var freeWaitingTimeDaily: Int = 0

    var cancelWaitingStartRentalTimeout: Int = 0

    var minimumChargeLevelToWarnUser: Int = 0

    var internalExternalExpertiesScreenOpenPeriodDurationInMin: Int = 0

    var internalExternalExpertiesDurationInMin: Int = 0

    var notifyLowBatteryPercentageLimit: Int = 0

    var notifyAndDeactivateLowBatteryPercentageLimit: Int = 0

    var alarmLowBatteryPercentageLimit: Int = 0

    var androidIconName: String? = null

    var notRequestingKMPackageOptionIsVisible: Boolean = true

    var lastRentalDateOfUserEmailNotVerifiedText: String? = null

    var interiorDamageReportDurationInMinutes: Int = 0

    var paymentCheckRefreshInterval: Int = 5

    var nOfTimeOfferZoneVehicle: Int = 0

    var numberOfStationToFitZoom: Int = 0
    var isparkInvoiceLoadPeriodInMinute: Int = 0

    var trustInSecureServerInWebView: Boolean = false

    init {
        if (mobileParameterList != null) {
            for (entry in mobileParameterList.entries) {
                when (entry.key) {
                    MobileParametersConstantsKey.VISIBLE_PRICE_RATIO -> visiblePriceRatio = entry.value as Double
                    MobileParametersConstantsKey.DURATION_LIMIT -> durationLimit = entry.value as Double
                    MobileParametersConstantsKey.DISTANCE_LIMIT -> distanceLimit = entry.value as Double
                    MobileParametersConstantsKey.FORCE_3D_PAYMENT -> force3dPayment = entry.value as Boolean
                    MobileParametersConstantsKey.VEHICLE_LIST_REFRESH_LIMIT_IN_METERS -> vehicleListRefreshLimitInMeters = (entry.value as Double).toFloat()
                    MobileParametersConstantsKey.VEHICLE_LIST_REFRESH_DURATION_IN_METERS -> vehicleListRefreshDurationInMinutes = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.CACHE_VERSION -> cacheVersion = entry.value as Double
                    MobileParametersConstantsKey.VEHICLE_DOOR_COMMAND_RADIUS -> vehicleDoorCommandRadius = entry.value as Double
                    MobileParametersConstantsKey.RADAR_SEARCH_MAX_DURATION_IN_MINUTES -> radarSearchMaxDurationInMinutes = entry.value as Double
                    MobileParametersConstantsKey.RADAR_SEARCH_SUCCESS_MINUTE -> radarSearchSuccessMinute = entry.value as Double
                    MobileParametersConstantsKey.CAMERA_RESOLUTION_ANDROID -> cameraResolutionAndroid = entry.value as String
                    MobileParametersConstantsKey.DIGITAL_AGREEMENT_VERSION -> digitalAgreementVersion = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.SEARCH_AVAILABLE_FOR_UNAPPROVED_USER_KEY -> isSearchAvailableForUnapprovedUser = entry.value as Boolean
                    MobileParametersConstantsKey.IS_HOME_BUTTON_ACTIVE -> isHomeButtonActive = entry.value as Boolean
                    MobileParametersConstantsKey.IS_OFFICE_BUTTON_ACTIVE -> isOfficeButtonActive = entry.value as Boolean
                    MobileParametersConstantsKey.IS_CAMPUS_BUTTON_ACTIVE -> isCampusButtonActive = entry.value as Boolean
                    MobileParametersConstantsKey.IS_ZONE_BUTTON_ACTIVE -> isZoneButtonActive = entry.value as Boolean
                    MobileParametersConstantsKey.IS_MALL_BUTTON_ACTIVE -> isMallButtonActive = entry.value as Boolean
                    MobileParametersConstantsKey.IS_CITY_BUTTON_ACTIVE -> isCityButtonActive = entry.value as Boolean
                    MobileParametersConstantsKey.MAZ_BILLING_FREEZE_TINE_IN_MIN -> maxBillingFreezeTimeInMin = entry.value as Double
                    MobileParametersConstantsKey.MIN_DAILY_RENTAL_DAYS -> minDailyRentalDays = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.MAX_DAILY_NO_REQUEST_DAYS -> maxDailyRequestDays = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.MAX_DAILY_NO_DAYS -> maxDailyNOfDays = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.MAX_DAILY_RENTAL_DAYS -> maxDailyRentalDays = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.DAILY_RENTAL_END_NOTICE_HOURS -> dailyRentalEndNoticeHours = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.SHOW_REMAININGFREEMINUTE_FOR_SELF_SERVICE -> showRemainingFreeMinuteForSelfService = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.INTERIOR_DAMAGE_REPORT_DURATION_IN_MINUTES -> interiorDamageReportDurationInMinutes = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.FREE_WAITING_TIME -> freeWaitingTime = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.INTERNAL_EXTERNAL_EXPERTIES_SCREEN_OPEN_PERIOD_DURATION_IN_MIN -> internalExternalExpertiesScreenOpenPeriodDurationInMin = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.INTERNAL_EXTERNAL_EXPERTIES_DURATION_IN_MIN -> internalExternalExpertiesDurationInMin = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.FREE_WAITING_TIME_DAILY -> freeWaitingTimeDaily = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.CANCEL_WAITING_START_RENTAL_TIMEOUT -> cancelWaitingStartRentalTimeout = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.MINIMUM_CHARGE_LEVEL_TO_WARN_USER -> minimumChargeLevelToWarnUser = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.NOTIFY_LOW_BATTERY_PERCENTAGE_LIMIT -> notifyLowBatteryPercentageLimit = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.NOTIFY_AND_DEACTIVATE_LOW_BATTERY_PERCENTAGE_LIMIT -> notifyAndDeactivateLowBatteryPercentageLimit = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.ALARM_LOW_BATTERY_PERCENTAGE_LIMIT -> alarmLowBatteryPercentageLimit = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.ANDROID_ICON_NAME -> androidIconName = entry.value as String
                    MobileParametersConstantsKey.NOT_REQUESTING_KM_PACKAGE_OPTION_IS_VISIBLE -> notRequestingKMPackageOptionIsVisible = entry.value as Boolean
                    MobileParametersConstantsKey.EMAIL_NOT_VERIFIED_TEXT -> lastRentalDateOfUserEmailNotVerifiedText = entry.value as String
                    MobileParametersConstantsKey.PAYMENT_CHECK_REFRESH_INTERVAL -> paymentCheckRefreshInterval = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.NO_OF_TIME_OFFER_ZONE_VEHICLE -> nOfTimeOfferZoneVehicle = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.NUMBER_OF_STATION_TO_FIT_ZOOM -> numberOfStationToFitZoom = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.IS_PARK_INVOICE_LOAD_PERIOD_IN_MINUTE -> isparkInvoiceLoadPeriodInMinute = (entry.value as Double).toInt()
                    MobileParametersConstantsKey.PAYMENT_ALLOW_INSECURE_CONNECTION -> trustInSecureServerInWebView = (entry.value as Boolean)
                }
            }
        }
    }

    object MobileParametersConstantsKey {
        const val VEHICLE_DOOR_COMMAND_RADIUS = "vehicleDoorCommandRadius"
        const val VISIBLE_PRICE_RATIO = "visiblePriceRatio"
        const val DISTANCE_LIMIT = "ssDistanceLimit"
        const val DURATION_LIMIT = "ssDurationLimit"
        const val DAILY_THRESHOLD_HOURS = "dailyThresholdHours"
        const val CALCULATION_TOOL_ENABLED = "calculationToolEnabled"
        const val CACHE_VERSION = "cacheVersion"
        const val RADAR_SEARCH_RADIUS = "radarSearchRadius"

        const val RADAR_SEARCH_MAX_DURATION_IN_MINUTES = "radarSearchMaxDurationInMinutes"
        const val RADAR_SEARCH_SUCCESS_MINUTE = "radarSearchSuccessMinute"

        const val CAMERA_RESOLUTION_ANDROID = "cameraResolutionAndroid"
        const val DIGITAL_AGREEMENT_VERSION = "digitalAgreementVersion"

        const val COUNTRY_LIST = "countryList"

        const val COUNTRY_LIST_TR = "countryListTr"
        const val COUNTRY_LIST_EN = "countryListEn"

        const val VEHICLE_LIST_REFRESH_LIMIT_IN_METERS = "vehicleListRefreshLimitInMeters"
        const val VEHICLE_LIST_REFRESH_DURATION_IN_METERS = "vehicleListRefreshDurationInMinutes"

        const val PAYCELL_ENABLED = "isPaycellEnabled"
        const val FORCE_3D_PAYMENT = "force3dPayment"

        const val SEARCH_AVAILABLE_FOR_UNAPPROVED_USER_KEY = "searchAvailableForUnapprovedUser"

        const val IS_HOME_BUTTON_ACTIVE = "isHomeButtonActive"

        const val IS_OFFICE_BUTTON_ACTIVE = "isOfficeButtonActive"

        const val IS_CAMPUS_BUTTON_ACTIVE = "isCampusButtonActive"

        const val IS_ZONE_BUTTON_ACTIVE = "isZoneButtonActive"

        const val IS_MALL_BUTTON_ACTIVE = "isMallButtonActive"

        const val IS_CITY_BUTTON_ACTIVE = "isCityButtonActive"

        const val MAZ_BILLING_FREEZE_TINE_IN_MIN = "maxBillingFreezeTimeInMin"

        const val MIN_DAILY_RENTAL_DAYS = "minDailyRentalDays"

        const val MAX_DAILY_RENTAL_DAYS = "maxDailyRentalDays"

        const val MAX_DAILY_NO_DAYS = "maxDailyNOfDays"

        const val MAX_DAILY_NO_REQUEST_DAYS = "maxDailyRequestDays"

        const val DAILY_RENTAL_END_NOTICE_HOURS = "dailyRentalEndNoticeHours"

        const val SHOW_REMAININGFREEMINUTE_FOR_SELF_SERVICE = "showRemainingFreeMinuteForSelfService"

        const val INTERIOR_DAMAGE_REPORT_DURATION_IN_MINUTES = "interiorDamageReportDurationInMinutes"

        const val FREE_WAITING_TIME = "freeWaitingTime"

        const val INTERNAL_EXTERNAL_EXPERTIES_SCREEN_OPEN_PERIOD_DURATION_IN_MIN = "internalExternalExpertiesScreenOpenPeriodDurationInMin"

        const val INTERNAL_EXTERNAL_EXPERTIES_DURATION_IN_MIN = "internalExternalExpertiesDurationInMin"

        const val FREE_WAITING_TIME_DAILY = "freeWaitingTimeDaily"

        const val CANCEL_WAITING_START_RENTAL_TIMEOUT = "cancelWaitingStartRentalTimeout"

        const val MINIMUM_CHARGE_LEVEL_TO_WARN_USER = "minimumChargeLevelToWarnUser"

        const val NOTIFY_LOW_BATTERY_PERCENTAGE_LIMIT = "notifyLowBatteryPercentageLimit"

        const val NOTIFY_AND_DEACTIVATE_LOW_BATTERY_PERCENTAGE_LIMIT = "notifyAndDeactivateLowBatteryPercentageLimit"

        const val ALARM_LOW_BATTERY_PERCENTAGE_LIMIT = "alarmLowBatteryPercentageLimit"

        const val ANDROID_ICON_NAME = "androidIconName"

        const val EMAIL_NOT_VERIFIED_TEXT = "lastRentalDateOfUserEmailNotVerifiedText"

        const val NOT_REQUESTING_KM_PACKAGE_OPTION_IS_VISIBLE = "notRequestingKMPackageOptionIsVisible"

        const val PAYMENT_CHECK_REFRESH_INTERVAL = "paymentCheckRefreshInterval"

        const val NO_OF_TIME_OFFER_ZONE_VEHICLE = "nOfTimeOfferZoneVehicle"

        const val NUMBER_OF_STATION_TO_FIT_ZOOM = "numberOfStationToFitZoom"

        const val IS_PARK_INVOICE_LOAD_PERIOD_IN_MINUTE = "isparkInvoiceLoadPeriodInMinute"

        const val PAYMENT_ALLOW_INSECURE_CONNECTION = "trustInSecureServerInWebView"

    }
}
