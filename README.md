# Dagger2MutiPresenterTest
test @Binds 


  實現Interface時  
    @Provides:直接回傳新的imp，當有不同用法(input)時需在Module再多寫一種方法   
      ex.  
	 @Provides  
	 static Presenter ProvidePresenter(){  
	   return new PresenterImp();  
	 }  
	OR  
	 @Provides  
	 static Presenter ProvidePresenter(UserData userData(){  
	   return new PresenterImp(userData);  
	 }  
    @Binds:建立一個抽象類別，相對的需在imp寫注入(Inject)  
      ex.@Binds  
	 abstract Presenter bindPresenter(PresenterImp presenterImp);  
  
	 在Imp加入  
	 @Inject  
	 public PresenterImp(){};  
	OR  
	 UserData userData;  
	 @Inject  
	 public PresenterImp(UserData userData){  
	   this.userData = userData;  
	 };  
