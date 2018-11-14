package com.consistent;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.consistent.models.rate.Medialink;
import com.consistent.models.rate.Medialinks;
import com.consistent.models.rate.Multimedia;
import com.consistent.models.rate.Rate;
import com.consistent.models.rate.Rates;
import com.consistent.rate.MappingString;



public class Main {
	static Map<String, String> getDataRate = new HashMap<>();
	static Map<String, List<String>> getDataRateList = new HashMap<>();
	static List<String> listType = new ArrayList<>();
	static List<String> listKeyword = new ArrayList<>();
	static List<String> listUrl = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JAXBContext context = JAXBContext.newInstance(Rates.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Rates rates = (Rates) unmarshaller.unmarshal(new File("/Users/bernardohernandez/Downloads/rate.xml"));
			Rates rates_en = (Rates) unmarshaller.unmarshal(new File("/Users/bernardohernandez/Downloads/rate.xml"));
			
			if(rates.getRate() != null && !rates.getRate().isEmpty()){
				for (Rate rate : rates.getRate()) {
					getDataRate.put("code", rate.getCode());
					getDataRate.put("", rate.getBenefits());
					getDataRate.put("", rate.getChannel());
					getDataRate.put("", rate.getCurrency());
					getDataRate.put("", rate.getGuid());
					getDataRate.put("", rate.getLanguage());
					getDataRate.put("", rate.getName());
					getDataRate.put("", rate.getOrder());
					getDataRate.put("", rate.getTitle());
					getDataRate.put("", rate.getKeyword());
					getDataRate.put("", rate.getShortDescription());
					if (rate.getMedialinks() != null && !rate.getMedialinks().isEmpty()) {
						for(Medialinks medialinks: rate.getMedialinks()){
							if(medialinks.getMedialinks() != null && !medialinks.getMedialinks().isEmpty()){
								for(Medialink medialink : medialinks.getMedialinks()){
									listType.add(medialink.getType());
									listKeyword.add(medialink.getKeyword());
									getDataRateList.put("type", listType);
									getDataRateList.put("keyword", listKeyword);
									if(medialink.getMultimedia() != null && !medialinks.getMedialinks().isEmpty()){
										for(Multimedia multimedia : medialink.getMultimedia()){
											listUrl.add(multimedia.getUrl());
											getDataRateList.put("url", listUrl);	
										}
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println(getDataRateList.get("type"));
			System.out.println(getDataRateList.get("keyword"));
			System.out.println(getDataRateList.get("url"));
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
       	
	}
	
	
	
	public String getRate(){
com.consistent.rate.MappingString mappingString = new MappingString();
		
		String rate = mappingString.DynamicHeader(
					mappingString.DynamicElement("Rate", "selection_break", "keyword",
								mappingString.DynamicElement("typeRate", "radio", "keyword", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("codeRate", "text", "keyword",
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("nameRate", "text", "keyword", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("keywordRate", "text", "keyword", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("descriptionRate", "selection_break", "keyword", 
										mappingString.DynamicElement("descriptionLongRate", "text_area", "text",
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("shortDescriptionRate", "text_area", "text", 
												mappingString.getDynamicContent("", "")
												)
										)+
								mappingString.DynamicElement("benefitsRate", "text_area", "text", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("Restrictions1", "text_area", "text", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("occupationRate", "selection_break", "keyword", 
										mappingString.DynamicElement("rateOnlyIncludesRoomForSingleAndDoubleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForQuadrupleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForSingleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForDoubleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForTripleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForSingleDoubleAndTripleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForSingleDoubleTripleAndQuadrupleOccupancy01", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForDoubleAndTripleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForSingleDoubleAndTripleOccupancy1", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForSingleDoubleAndQuadrupleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("rateOnlyIncludesRoomForDoubleTripleAndQuadrupleOccupancy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("promotionValidUntil", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("promotionIsValid", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("Other1", "text", "keyword", 
												mappingString.getDynamicContent("", "")
												)
										)+//Fin de ocupacion
								mappingString.DynamicElement("Benefits1", "selection_break", "keyword", 
										mappingString.DynamicElement("wirelessInternetRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("breakfastBuffetRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("americanBreakfastBuffetRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("domesticPhoneCallsRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("tipsForBellboysRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("tipsForHousekeepingRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("tipsToWaitersRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("freeParkingRate", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("parkingFee75MXNPerNight", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("specialRateForBreakfastBuffet179MXNTaxesIncluded", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("15OffInFoodAndBeverages", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("15DiscountOnFoodAndNonAlcoholicBeverages", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("15OffInLaundryService", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("freeParking6", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("useToTheWashingAndIroningCenter", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("20OffInRoomService", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("10OffInMealsAndDinners", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("FreeParking10", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("15OffInSpaTreatments", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("welcomeDrinkOnArrival", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("freeAccessToTheGym", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("accessToTheGymAndWirelessInternetForFree", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("10DiscountOnYourStay", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("20DiscountOnYourStay", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("30DiscountOnYourStay", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("40DiscountOnYourStay", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("50DiscountOnYourStay", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("EarnFiestaRewardsPoints", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("AccumulateMotivaAndAppreciatePoints", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("EnjoyFreeBreakfast", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("ReceiveFreeNight", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TheyApply3MonthsWithoutInterestInMinimumPurchasesOf2000PesosOnlyWithAmericanExpressCreditCards", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TheyApply3MonthsWithoutInterestInMinimumPurchasesOf2000PesosOnlyWithAmericanExpressCreditCardsiidt", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("RememberThatYouCanEnjoyOurAllinclusivePlanAtLiveAquaBoutiqueResortPlayaDelCarmenLiveAquaBeachResortCancunGrandFiestaAmericanaLosCabosGrandFiestaAmericanaPuertoVallartaFiestaAmericanaCondesaCancunFiestaAmericanaCozumelFiestaAmericanaPuertoVallartaTheExploreanKohunlichAndTheExploreanCozumelft90", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("Otro9a1y", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)
										)+ // Fin de Beneficios
								mappingString.DynamicElement("Restrictions", "selection_break", "keyword", 
										mappingString.DynamicElement("10DeDescuentoEnTuEstancia9ymr", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("20DeDescuentoEnTuEstanciae3qr", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("30DeDescuentoEnTuEstancia4zge", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("40DeDescuentoEnTuEstanciahyvg", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("50DeDescuentoEnTuEstanciaeonn", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("AcumulaPuntosFiestaRewards8tsy", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("AcumulaPuntosMotivaYApreciarea7ab", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("DisfrutaDesayunoGratis8nrt", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("RecibeNocheGratis14rb", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("MinimumNightsStayIsRequired", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TarifaNoAplicaEnOcupacinCudruple2yea", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TarifaNoAplicaEnOcupacinSencillaTripleNiCudruple3f2o", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TarifaNoAplicaEnOcupacinDobleTripleNiCudruple1a29", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TarifaNoAplicaEnOcupacinSencillaNiCudruple3ylu", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TarifaNoAplicaEnOcupacinSencillaNiDoble8eha", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("TarifaNoAplicaEnOcupacinSencillab1uw", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("ToAvoidChargesReviewTheCancellationAndModificationPoliciesBeforeConfirmingyourReservation", "boolean", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("Other2", "text", "keyword", 
												mappingString.getDynamicContent("", "")
												)
										)+// Fin de Restricciones
								mappingString.DynamicElement("websiteRate", "selection_break", "keyword", 
										mappingString.DynamicElement("Descriptions1", "text", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("relatedContractsRate", "text", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("MediaLink1", "document_library", "keyword", 
												mappingString.DynamicElement("TypeRate2", "list", "keyword", 
														mappingString.getDynamicContent("", "")
														)+
												mappingString.DynamicElement("Footer", "text", "keyword", 
														mappingString.getDynamicContent("", "")
														)+
												mappingString.getDynamicContent("", "")
												)
										) +// Fin de web site rate
								mappingString.DynamicElement("bannerTravelClickRate", "selection_break", "keyword", 
										mappingString.DynamicElement("headerRate", "text_area", "text", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("Descriptions2", "text_area", "text", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("mediaLinkTravelClickRate", "document_library", "keyword", 
												mappingString.DynamicElement("TypeRate1", "list", "keyword", 
														mappingString.getDynamicContent("", "")
														)+
												mappingString.DynamicElement("Piemb2o", "text", "keyword", 
														mappingString.getDynamicContent("", "")
														)+
												mappingString.DynamicElement("mountRate", "text", "keyword", 
														mappingString.getDynamicContent("", "")
														)+
												mappingString.getDynamicContent("", "")
												)
										)+ //Fin de Media Link Travel Click
								mappingString.DynamicElement("promoCodeRate", "text", "keyword", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("currencyRate", "list", "keyword", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("mediaLinksRate", "selection_break", "keyword", 
										mappingString.DynamicElement("mediaLinkRate", "document_library", "keyword", 
												mappingString.DynamicElement("TypeRate3", "list", "keyword", 
														mappingString.getDynamicContent("", "")
														)+
												mappingString.DynamicElement("PieRate4", "text", "keyword", 
														mappingString.getDynamicContent("", "")
														)+
														mappingString.getDynamicContent("", "")
													)
										
										)+
								mappingString.DynamicElement("bookingDateRate", "selection_break", "keyword", 
										mappingString.DynamicElement("initialDateBooking", "ddm-date", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("finalDateBooking", "ddm-date", "keyword", 
												mappingString.getDynamicContent("", "")
												)
										)+
								mappingString.DynamicElement("travelDateRate", "selection_break", "keyword", 
										mappingString.DynamicElement("initialDateTravel", "ddm-date", "keyword", 
												mappingString.getDynamicContent("", "")
												)+
										mappingString.DynamicElement("finalDateTravel", "ddm-date", "keyword", 
												mappingString.getDynamicContent("", "")
												)
										)	
							)
					);
		return rate;
	}
	
	
	
}
