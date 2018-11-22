<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Administator Login</name>
   <tag></tag>
   <elementGuidId>d26c8557-fe4f-47ff-8f57-fce6e599beec</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
    
    
    Administator Login
    
    
    
    
    
    
    
    
    
    
  
   #rotatingDiv{display:block;margin:32px auto;height:100px;width:100px;-webkit-animation:rotation .9s infinite linear;-moz-animation:rotation .9s infinite linear;-o-animation:rotation .9s infinite linear;animation:rotation .9s infinite linear;border-left:8px solid rgba(0,0,0,.20);border-right:8px solid rgba(0,0,0,.20);border-bottom:8px solid rgba(0,0,0,.20);border-top:8px solid rgba(33,128,192,1);border-radius:100%}@keyframes rotation{from{transform:rotate(0deg)}to{transform:rotate(359deg)}}@-webkit-keyframes rotation{from{-webkit-transform:rotate(0deg)}to{-webkit-transform:rotate(359deg)}}@-moz-keyframes rotation{from{-moz-transform:rotate(0deg)}to{-moz-transform:rotate(359deg)}}@-o-keyframes rotation{from{-o-transform:rotate(0deg)}to{-o-transform:rotate(359deg)}}input:-webkit-autofill,input:-webkit-autofill:hover,input:-webkit-autofill:focus,input:-webkit-autofill:active{transition:background-color 5000s ease-in-out 5s}.login-panel{background:url(https://www.phptravels.net/assets/img/login.jpg) no-repeat center center / cover!important;height:100%}
  .alert-inverse {position: absolute; margin-top: -270px; margin-left: -30px; width: 350px; height: 300px; text-align: center; padding-top: 124px; text-transform: uppercase; font-weight: bold; font-size: 16px; letter-spacing: 2px; background-color: rgba(19, 19, 19, 0.89); color: #ffffff; }
  .form-signin .form-control { position: relative; height: auto; -webkit-box-sizing: border-box; box-sizing: border-box; margin-bottom: 10px!important; border: 0px; border-bottom: 1px solid #9d9d9d; font-size: 16px; }
  .btn-primary { background: #0031bc }
  
    $(function() {
      Login.init()
    });
  
    $(function () {
    $(&quot;.form-signin&quot;).on('submit',function(){
    $(&quot;.resultlogin&quot;).html(&quot;&lt;div class='alert alert-inverse loading wow fadeOut animated'>Hold On...&lt;/div>&quot;);
    $.post(&quot;https://www.phptravels.net/admin/login&quot;,$(&quot;.form-signin&quot;).serialize(), function(response){
    var resp = $.parseJSON(response);
    console.log(resp);
    if(!resp.status){
    $(&quot;.resultlogin&quot;).html(&quot;&lt;div class='alert alert-danger loading wow fadeIn animated'>&quot;+resp.msg+&quot;&lt;/div>&quot;);
    }else{
    $(&quot;.resultlogin&quot;).html(&quot;&lt;div class='alert alert-success login wow fadeIn animated'>Redirecting Please Wait...&lt;/div>&quot;);
    window.location.replace(resp.url);
    }
    }); });
    $(&quot;.resetbtn&quot;).on('click',function(){
    var resetemail = $(&quot;#resetemail&quot;).val();
    if(resetemail == &quot;&quot;){
    alert(&quot;Please Enter Email Address&quot;);
    }else{
     $(&quot;.resultreset&quot;).html(&quot;&lt;div id='rotatingDiv'>&lt;/div>&quot;);
     $.post(&quot;https://www.phptravels.net/admin/resetpass&quot;,$(&quot;#passresetfrm&quot;).serialize(), function(response){
     if($.trim(response) == '1'){
     $(&quot;.resultreset&quot;).html(&quot;&lt;div class='alert alert-success'>New Password sent to &quot;+resetemail+&quot;, Kindly check email.&lt;/div>&quot;);
     }else{
     $(&quot;.resultreset&quot;).html(&quot;&lt;div class='alert alert-danger'>Email Not Found&lt;/div>&quot;);
     } });
     }
     });
     });
  #katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-elementInfoDiv {color: lightblue; padding: 5px}
  

  
  
   
   
    
    
      
        Login Panel
        
        
        
          
            
             Remember me
            
          
          
            
               Forget Password
              
            
          
        
      
      Login
      
    
    
       Forgot Password
      
      Enter your email address to reset your password
      
      
        
        
        
      
      
      
         Back
        Reset My Password
      
    
        Powered by  PHPTRAVELS v6.5 
    
   


    
    Ladda.bind( 'div:not(.progress-demo) button', { timeout: 2000 } );
    Ladda.bind( '.progress-demo button', {
    	callback: function( instance ) {
    		var progress = 0;
    		var interval = setInterval( function() {
    			progress = Math.min( progress + Math.random() * 0.1, 1 );
    			instance.setProgress( progress );
    			if( progress === 1 ) {
    				instance.stop();
    				clearInterval( interval );
    			}
    		}, 200 );
    	}
    } );
  
  
  
  
  
    var cb, optionSet1;
        $(&quot;.checkbox&quot;).iCheck({
          checkboxClass: &quot;icheckbox_square-grey&quot;,
          radioClass: &quot;iradio_square-grey&quot;
        });

        $(&quot;.radio&quot;).iCheck({
          checkboxClass: &quot;icheckbox_square-grey&quot;,
          radioClass: &quot;iradio_square-grey&quot;
        });
  

  
  
    new WOW().init();
  
  /html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]</value>
   </webElementProperties>
</WebElementEntity>
