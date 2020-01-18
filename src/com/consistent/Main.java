package com.consistent;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.consistent.models.rate.Content;
import com.consistent.models.rate.Contents;
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
	static List<String> listType_en = new ArrayList<>();
	static List<String> listKeyword_en = new ArrayList<>();
	static List<String> listUrl_en = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JAXBContext context = JAXBContext.newInstance(Contents.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			String _rate = "/Users/bernardohernandez/Downloads/ratesenglsih.xml";
			//String _rateTwo = "";
			System.out.println("antes");
			if(_rate!= null && !_rate.equals("")){
				Contents contents = (Contents) unmarshaller.unmarshal(new File(_rate));
				
				if(contents != null){
					for (Content content : contents.getContents()) {
						System.out.println(contents.getContents().size());
					}
				}
				
				
				
				/*if(rates.getRate().size()>0){
					if(rates.getRate() != null && !rates.getRate().isEmpty()){
						for (Rate rate : rates.getRate()) {
							getDataRate.put("code", rate.getCode());
							getDataRate.put("benefits", rate.getBenefits());
							getDataRate.put("channel", rate.getChannel());
							getDataRate.put("currency", rate.getCurrency());
							getDataRate.put("guid", rate.getGuid());
							getDataRate.put("language", rate.getLanguage());
							getDataRate.put("name", rate.getName());
							getDataRate.put("order", rate.getOrder());
							getDataRate.put("title", rate.getTitle());
							getDataRate.put("keyword", rate.getKeyword());
							getDataRate.put("shortDescription", rate.getShortDescription());
							getDataRate.put("description", rate.getDescription());
							getDataRate.put("restrictions", rate.getRestrictions());
							getDataRate.put("end", rate.getEnd());
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
				}
				
				
				
			}*/
			
			/*if(_rateTwo != null && !_rateTwo.equals("")){
				Rates rates_en = (Rates) unmarshaller.unmarshal(new File(_rateTwo));
				
				if(!rates_en.getRate().isEmpty() && rates_en.getRate() != null && rates_en.getRate().size() > 0){
					for (Rate rate : rates_en.getRate()) {
						getDataRate.put("code_en", rate.getCode());
						getDataRate.put("benefits_en", rate.getBenefits());
						getDataRate.put("channel_en", rate.getChannel());
						getDataRate.put("currency_en", rate.getCurrency());
						getDataRate.put("guid_en", rate.getGuid());
						getDataRate.put("language_en", rate.getLanguage());
						getDataRate.put("name_en", rate.getName());
						getDataRate.put("order_en", rate.getOrder());
						getDataRate.put("title_en", rate.getTitle());
						getDataRate.put("keyword_en", rate.getKeyword());
						getDataRate.put("shortDescription_en", rate.getShortDescription());
						getDataRate.put("description_en", rate.getDescription());
						getDataRate.put("restrictions_en", rate.getRestrictions());
						getDataRate.put("end_en", rate.getEnd());
						if (rate.getMedialinks() != null && !rate.getMedialinks().isEmpty()) {
							for(Medialinks medialinks: rate.getMedialinks()){
								if(medialinks.getMedialinks() != null && !medialinks.getMedialinks().isEmpty()){
									for(Medialink medialink : medialinks.getMedialinks()){
										listType_en.add(medialink.getType());
										listKeyword_en.add(medialink.getKeyword());
										getDataRateList.put("type_en", listType_en);
										getDataRateList.put("keyword_en", listKeyword_en);
										if(medialink.getMultimedia() != null && !medialinks.getMedialinks().isEmpty()){
											for(Multimedia multimedia : medialink.getMultimedia()){
												listUrl_en.add(multimedia.getUrl());
												getDataRateList.put("url_en", listUrl_en);	
											}
										}
									}
								}
							}
						}
					}
				}
			}*/
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
       	
	}
	
	
	
	
	public static String getRate(){
com.consistent.rate.MappingString mappingString = new MappingString();
		
		String rate = mappingString.DynamicHeader(
					mappingString.DynamicElement("Rate", "selection_break", "keyword",
								mappingString.DynamicElement("typeRate", "radio", "keyword", 
										mappingString.getDynamicContent("", "")
										)+
								mappingString.DynamicElement("codeRate", "text", "keyword",
										mappingString.getDynamicContent(getDataRate.get("code"),getDataRate.get("code_en"))
										)+
								mappingString.DynamicElement("nameRate", "text", "keyword", 
										mappingString.getDynamicContent(getDataRate.get("name"), getDataRate.get("name_en"))
										)+
								mappingString.DynamicElement("keywordRate", "text", "keyword", 
										mappingString.getDynamicContent(getDataRate.get("keyword"), getDataRate.get("keyword_en"))
										)+
								mappingString.DynamicElement("descriptionRate", "selection_break", "keyword", 
										mappingString.DynamicElement("descriptionLongRate", "text_area", "text",
												mappingString.getDynamicContent(getDataRate.get("description"), getDataRate.get("description"))
												)+
										mappingString.DynamicElement("shortDescriptionRate", "text_area", "text", 
												mappingString.getDynamicContent(getDataRate.get("shortDescription"), getDataRate.get("shortDescription_en"))
												)
										)+
								mappingString.DynamicElement("benefitsRate", "text_area", "text", 
										mappingString.getDynamicContent(getDataRate.get("benefits"), getDataRate.get("benefits_en"))
										)+
								mappingString.DynamicElement("Restrictions1", "text_area", "text", 
										mappingString.getDynamicContent(getDataRate.get("restrictions"), getDataRate.get("restrictions_en"))
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
										mappingString.getDynamicContent(getDataRate.get("currency"), getDataRate.get("currency_en"))
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
												mappingString.getDynamicContent(getDataRate.get("end"), getDataRate.get("end_en"))
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
