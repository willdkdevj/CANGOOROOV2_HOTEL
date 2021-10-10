/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.Cangooroov2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author William Dias
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Room {
    
    @JsonProperty("BoardDescription")
    private String boardDescription;
    
    @JsonProperty("CanBook")
    private Boolean canBook;
    
    @JsonProperty("CanInforSupplierInformation")
    private Boolean canInforSupplierInformation;
    
    @JsonProperty("CancellationPolicies")
    private List<CancellationPolicy> cancellationPolicies;

    @JsonProperty("CheckInHour")
    private String checkInHour;
    
    @JsonProperty("CheckOutHour")
    private String checkOutHour;
    
    @JsonProperty("ChildAges")
    private List<Integer> childAges;
    
    @JsonProperty("Commission")
    private ValuesDouble commission;
    
    @JsonProperty("CommissionPercent")
    private Double commissionPercent;
    
    @JsonProperty("CommissionCalculation")
    private String commissionCalculation;
    
    @JsonProperty("CustomFields")
    private String customFields;
    
    @JsonProperty("DepositRequired")
    private Boolean depositRequired;
    
    @JsonProperty("DirectAgreement")
    private Boolean directAgreement;
    
    @JsonProperty("HasBreakfast")
    private Boolean hasBreakfast;
    
    @JsonProperty("Id")
    private Integer id;
    
    @JsonProperty("IsAvailable")
    private Boolean isAvailable;
    
    @JsonProperty("IsNonRefundable")
    private Boolean isNonRefundable;
    
    @JsonProperty("IsPrePayment")
    private Boolean isPrePayment;
    
    @JsonProperty("MediaRoomId")
    private String mediaRoomId;
    
    @JsonProperty("MoreInformation")
    private String moreInformation;
    
    @JsonProperty("NumAdults")
    private Integer numAdults;
    
    @JsonProperty("PayDirectToHotel")
    private Boolean payDirectToHotel;
    
    @JsonProperty("Promotions")
    private List<String> promotions;
    
    @JsonProperty("PropertyTaxes")
    private List<Double> propertyTaxes;
    
    @JsonProperty("Quantity")
    private Integer quantity;
    
    @JsonProperty("RoomDescription")
    private String roomDescription;
    
    @JsonProperty("SellingPricePerRoom")
    private ValuesDouble sellingPricePerRoom;
    
    @JsonProperty("Services")
    private List<Service> services;
    
    @JsonProperty("SpecialOffer")
    private Boolean specialOffer;
    
    @JsonProperty("Taxes")
    private List<Double> taxes;
    
    @JsonProperty("TotalSellingPrice")
    private ValuesDouble totalSellingPrice;
    
    @JsonProperty("TotalTax")
    private ValuesDouble totalTax;
    
    @JsonProperty("MustCheckHotelInfo")
    private Boolean mustCheckHotelInfo;
    
    @JsonProperty("ShowCreditCard")
    private Boolean showCreditCard;   
        
    @JsonProperty("RoomId")
    private String roomId;
    
    @JsonProperty("RoomServices")
    private List<Service> roomServices;
    
    @JsonProperty("Paxs")
    private List<Pax> paxs;

    @JsonProperty("AutomaticCancellation")
    private Boolean automaticCancellation;
    
    @JsonProperty("CancellationDate")
    private String cancellationDate;
    
    @JsonProperty("CheckIn")
    private String checkIn;
    
    @JsonProperty("CheckOut")
    private String checkOut;

    @JsonProperty("CityId")
    private Integer cityId;
    
    @JsonProperty("CityName")
    private String cityName;
   
    @JsonProperty("CountryCode")
    private String countryCode;
    
    @JsonProperty("CountryId")
    private String countryId;
    
    @JsonProperty("CountryName")
    private String countryName;
    
    @JsonProperty("DestinationId")
    private String destinationId;
    
    @JsonProperty("DestinationName")
    private String destinationName;
    
    @JsonProperty("DiscountCoupon")
    private String discountCoupon;
    
    @JsonProperty("HotelAddress")
    private String hotelAddress;
    
    @JsonProperty("HotelCategory")
    private String hotelCategory;
    
    @JsonProperty("HotelConfirmationNumber")
    private String hotelConfirmationNumber;
    
    @JsonProperty("HotelId")
    private String hotelId;
    
    @JsonProperty("HotelName")
    private String hotelName;
    
    @JsonProperty("LogXMLAudit")
    private String logXMLAudit;
    
    @JsonProperty("MarkupCalculation")
    private String markupCalculation;
    
    @JsonProperty("NetTax")
    private ValuesDouble netTax;
    
    @JsonProperty("NumberOfChildren")
    private Integer numberOfChildren;
    
    @JsonProperty("NumberOfNights")
    private Integer numberOfNights;
    
    @JsonProperty("Observations")
    private String observations;
    
    @JsonProperty("PaymentCurrency")
    private String paymentCurrency;
    
    @JsonProperty("PaymentDate")
    private String paymentDate;
    
    @JsonProperty("PaymentDeadLine")
    private String paymentDeadLine;
    
    @JsonProperty("PaymentStatus")
    private String paymentStatus;
    
    @JsonProperty("Payments")
    private String payments;
    
    @JsonProperty("Phone")
    private String phone;
    
    @JsonProperty("ReservationDate")
    private String reservationDate;
    
    @JsonProperty("ReservationId")
    private String reservationId;
    
    @JsonProperty("SellingPrice")
    private ValuesDouble sellingPrice;
    
    @JsonProperty("ServiceId")
    private String serviceId;
    
    @JsonProperty("Status")
    private String status;
    
    @JsonProperty("SupplierHotelId")
    private String supplierHotelId;
    
    @JsonProperty("SupplierInformation")
    private String supplierInformation;
    
    @JsonProperty("SupplierReservationCode")
    private String supplierReservationCode;
    
    @JsonProperty("VoucherObservation")
    private String voucherObservation;
    
    @JsonProperty("name")
    private Name name;
    
    @JsonProperty("description")
    private Description description;
    
    @JsonProperty("amenities")
    private List<Amenity> amenities;
    
    @JsonProperty("photos")
    private List<Photo> photos;
    
    @JsonProperty("code")
    private String code;

    // Construtor de HotelDetail
    public Room(Name name, Description description, List<Amenity> amenities, List<Photo> photos, String code) {
        this.name = name;
        this.description = description;
        this.amenities = amenities;
        this.photos = photos;
        this.code = code;
    }


    // Construtor de DoBookingRQ
    public Room(List<Pax> paxs, String roomId, List<Service> roomServices) {
        this.paxs = paxs;
        this.roomId = roomId;
        this.roomServices = roomServices;
    }
    
    public Room(String boardDescription, Boolean canBook, Boolean canInforSupplierInformation, List<CancellationPolicy> cancellationPolicies, String checkInHour, String checkOutHour, List<Integer> childAges, ValuesDouble commission, Double commissionPercent, String commissionCalculation, String customFields, Boolean depositRequired, Boolean directAgreement, Boolean hasBreakfast, Integer id, Boolean isAvailable, Boolean isNonRefundable, Boolean isPrePayment, String mediaRoomId, String moreInformation, Integer numAdults, Boolean payDirectToHotel, List<String> promotions, List<Double> propertyTaxes, Integer quantity, String roomDescription, ValuesDouble sellingPricePerRoom, List<Service> services, Boolean specialOffer, List<Double> taxes, ValuesDouble totalSellingPrice, ValuesDouble totalTax, Boolean mustCheckHotelInfo, Boolean showCreditCard, List<Pax> paxs) {
        this.boardDescription = boardDescription;
        this.canBook = canBook;
        this.canInforSupplierInformation = canInforSupplierInformation;
        this.cancellationPolicies = cancellationPolicies;
        this.checkInHour = checkInHour;
        this.checkOutHour = checkOutHour;
        this.childAges = childAges;
        this.commission = commission;
        this.commissionPercent = commissionPercent;
        this.commissionCalculation = commissionCalculation;
        this.customFields = customFields;
        this.depositRequired = depositRequired;
        this.directAgreement = directAgreement;
        this.hasBreakfast = hasBreakfast;
        this.id = id;
        this.isAvailable = isAvailable;
        this.isNonRefundable = isNonRefundable;
        this.isPrePayment = isPrePayment;
        this.mediaRoomId = mediaRoomId;
        this.moreInformation = moreInformation;
        this.numAdults = numAdults;
        this.payDirectToHotel = payDirectToHotel;
        this.promotions = promotions;
        this.propertyTaxes = propertyTaxes;
        this.quantity = quantity;
        this.roomDescription = roomDescription;
        this.sellingPricePerRoom = sellingPricePerRoom;
        this.services = services;
        this.specialOffer = specialOffer;
        this.taxes = taxes;
        this.totalSellingPrice = totalSellingPrice;
        this.totalTax = totalTax;
        this.mustCheckHotelInfo = mustCheckHotelInfo;
        this.showCreditCard = showCreditCard;
        this.paxs = paxs;
    }

    // Construtor de DoBookingRS
    public Room(Boolean automaticCancellation, String boardDescription, String cancellationDate, List<CancellationPolicy> cancellationPolicies, String checkIn, String checkInHour, String checkOut, String checkOutHour, Integer cityId, String cityName, ValuesDouble commission, String commissionCalculation, String countryCode, String countryId, String countryName, String destinationId, String destinationName, String discountCoupon, String hotelAddress, String hotelCategory, String hotelConfirmationNumber, String hotelId, String hotelName, String logXMLAudit, String markupCalculation, ValuesDouble netTax, Integer numberOfChildren, Integer numberOfNights, String observations, List<Pax> paxs, String paymentCurrency, String paymentDate, String paymentDeadLine, String paymentStatus, String payments, String phone, String reservationDate, String reversationId, String roomDescription, ValuesDouble sellingPrice, String serviceId, String status, String supplierHotelId, String supplierInformation, String supplierReservationCode, List<Double> taxes, ValuesDouble totalTax, String voucherObservation) {
        this.automaticCancellation = automaticCancellation;
        this.boardDescription = boardDescription;
        this.cancellationDate = cancellationDate;
        this.cancellationPolicies = cancellationPolicies;
        this.checkIn = checkIn;
        this.checkInHour = checkInHour;
        this.checkOut = checkOut;
        this.checkOutHour = checkOutHour;
        this.cityId = cityId;
        this.cityName = cityName;
        this.commission = commission;
        this.commissionCalculation = commissionCalculation;
        this.countryCode = countryCode;
        this.countryId = countryId;
        this.countryName = countryName;
        this.destinationId = destinationId;
        this.destinationName = destinationName;
        this.discountCoupon = discountCoupon;
        this.hotelAddress = hotelAddress;
        this.hotelCategory = hotelCategory;
        this.hotelConfirmationNumber = hotelConfirmationNumber;
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.logXMLAudit = logXMLAudit;
        this.markupCalculation = markupCalculation;
        this.netTax = netTax;
        this.numberOfChildren = numberOfChildren;
        this.numberOfNights = numberOfNights;
        this.observations = observations;
        this.paxs = paxs;
        this.paymentCurrency = paymentCurrency;
        this.paymentDate = paymentDate;
        this.paymentDeadLine = paymentDeadLine;
        this.paymentStatus = paymentStatus;
        this.payments = payments;
        this.phone = phone;
        this.reservationDate = reservationDate;
        this.reservationId = reversationId;
        this.roomDescription = roomDescription;
        this.sellingPrice = sellingPrice;
        this.serviceId = serviceId;
        this.status = status;
        this.supplierHotelId = supplierHotelId;
        this.supplierInformation = supplierInformation;
        this.supplierReservationCode = supplierReservationCode;
        this.taxes = taxes;
        this.totalTax = totalTax;
        this.voucherObservation = voucherObservation;
    }

}
