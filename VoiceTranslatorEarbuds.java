class VoiceTranslatorEarbuds{
static boolean Earbuds;
static boolean workOrNotWork(){
	if(Earbuds==false){
		Earbuds=true;
		System.out.println("Buds works");
	}
	else if(Earbuds==true){
		Earbuds=false;
		System.out.println("Buds not works");
	}
   return Earbuds;
  }
}