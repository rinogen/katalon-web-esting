<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>section_SEARCH FOR BEST FLIGHTS            _e7e9eb</name>
   <tag></tag>
   <elementGuidId>775b6376-8737-499b-b56e-999e1a18750a</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>section.container</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body[@id='fadein']/section/section</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>section</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>container</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

SEARCH FOR BEST FLIGHTS



    
        
            
                
                    
                        
                         One Way
                    
                
                
                    
                        
                         Round Trip
                    
                
                
            
        
        
            
                                Economy
                Business
                First
            
        
    
    
        
            
                
                    
                        Flying From
                        
                            
                            
                        
                    
                
                
                    
                    
                    
                        
                              
                        
                        
                              
                        
                    
                
                        To Destination
                        
                            
                            
                        
                    
                
            
        
        
            
                
                    
                        Departure Date
                        
                            
                            
                        
                    
                
                
                    
                        Return Date
                        
                            
                            
                        
                    
                
            
        
        
            
                Passengers
                
                    
                        
                        
                        1
                        
                        
                            
                                
                                    
                                         Adults 
                                    
                                    
                                        
                                    
                                
                            
                            
                                
                                    
                                         Childs  
                                    
                                    
                                        
                                    
                                
                            
                            
                                
                                    
                                         Infants  
                                    
                                    
                                        
                                    
                                
                            
                        
                    
                
            
        
        
        
            
                 Search
            
        
    
    
    
        
            
                
                    
                        
                            
                                Flying From
                                
                                    
                                    
                                        
                                    
                                
                            
                        
                        
                            
                                To Destination
                                
                                    
                                    
                                        
                                    
                                
                            
                        
                    
                
                
                    
                        
                            
                                Departure Date
                                
                                    
                                    
                                
                            
                        
                    
                
                
                
                  
                 
                
            
        
        
            
                
                    Add another flight
                
            
        
    





// SWAP VALUES
var btn = document.getElementById(&quot;swap&quot;);
btn.addEventListener(&quot;click&quot;, function(e) {
var from = document.getElementById(&quot;autocomplete&quot;),
    to = document.getElementById(&quot;autocomplete2&quot;);
if(!!from &amp;&amp; !!to) {
    var _ = from.value;
    from.value = to.value;
    to.value = _;
} else {
    console.log(&quot;some input elements could not be found&quot;);
} 
});

// show loading model of flights
function load_modal() {
var flying_from = $(&quot;#autocomplete&quot;).val();
$('.flying_from').append(flying_from);
var flying_to = $(&quot;#autocomplete2&quot;).val();
$('.flying_to').append(flying_to);
var date = $(&quot;#departure&quot;).val();
$('.date').append(date);
$('#flights_load').modal('show'); 

$(function(){ setTimeout(function(){
$(&quot;.loading-results-globe .loading-results-track-progress.is-active&quot;).css('width',480);
},500);
});

};

// URL beurify and search action
$(&quot;#flights-search&quot;).click(function() {
var trip_type = $('input[name=trip]:checked').val();
var origin = $(&quot;#autocomplete&quot;).val().toLowerCase();
var destination = $(&quot;#autocomplete2&quot;).val().toLowerCase();
var cdeparture = $(&quot;#departure&quot;).val();
var returnn = $(&quot;#return&quot;).val();
var flight_type = $(&quot;#flight_type&quot;).val().toLowerCase();
var adult = $(&quot;#fadults&quot;).val();
var children  = $(&quot;#fchilds&quot;).val();
var infant  = $(&quot;#finfant&quot;).val();
var language = $('#language').val();
var origin_split = origin.split(' ');
var origin = origin_split[0];
var destination_split = destination.split(' ');
var destination = destination_split[0];
if(origin == ''){
alert('Please fill out origin');
$('#autocomplete').focus();
}else if(destination == ''){
alert('Please fill out destination');
$('#autocomplete2').focus();

// main params of get url
}else{ var actionURL =  'flights/' + language +'/'+ 'usd' + '/' ;

// for oneway
if (trip_type == 'oneway') { var finelURL = actionURL +origin+'/'+destination+'/'+trip_type+'/'+flight_type+'/'+cdeparture+'/'+adult+'/'+children+'/'+infant;
$(&quot;html, body&quot;).animate({ scrollTop: 0 }, &quot;fast&quot;);
window.location.href = 'https://www.phptravels.net/'+finelURL;
load_modal();

// for return
}else if(trip_type == 'return'){ var finelURL = actionURL +origin+'/'+destination+'/'+trip_type+'/'+flight_type+'/'+cdeparture+'/'+returnn+'/'+adult+'/'+children+'/'+infant;
$(&quot;html, body&quot;).animate({ scrollTop: 0 }, &quot;fast&quot;);
window.location.href = 'https://www.phptravels.net/'+finelURL;
load_modal();

// for multi way
}else{ var finelURL = actionURL +origin+'/'+destination+'/'+cdeparture+'/'+origin+'/'+destination+'/'+cdeparture+'/'+origin+'/'+destination+'/'+cdeparture+'/'+trip_type+'/'+flight_type+'/'+adult+'/'+children+'/'+infant;
$(&quot;html, body&quot;).animate({ scrollTop: 0 }, &quot;fast&quot;);
window.location.href = 'https://www.phptravels.net/'+finelURL;
load_modal();
}}});

/* oneway */
document.getElementById(&quot;one-way&quot;).onclick = function() {
document.getElementById(&quot;show&quot;).className = &quot;col hide&quot;;
document.getElementById(&quot;onereturn&quot;).className = &quot;row g-1 contact-form-action&quot;;
document.getElementById(&quot;multiway&quot;).className = &quot;&quot;;
document.getElementById(&quot;departure&quot;).className = &quot;depart form-control&quot;; }

/* return */
document.getElementById(&quot;round-trip&quot;).onclick = function() {
document.getElementById(&quot;show&quot;).className = &quot;col show&quot;;
document.getElementById(&quot;onereturn&quot;).className = &quot;row g-1 contact-form-action&quot;;
document.getElementById(&quot;multiway&quot;).className = &quot;&quot;;
document.getElementById(&quot;departure&quot;).className = &quot;depart form-control dateleft border-top-r0&quot;; }

/* multiway */
/*document.getElementById(&quot;multi-trip&quot;).onclick = function() {
document.getElementById(&quot;multiway&quot;).className = &quot;multi-flight-wrap show&quot;;
document.getElementById(&quot;show&quot;).className = &quot;col hide&quot;;
document.getElementById(&quot;departure&quot;).className = &quot;depart form-control&quot;; }*/





.hide { display: none; }
.show { display: block !important; }
#show,#multiway { display: none; }





    

        
            
        
        

        
            

                
 
                    

                        
                        
                        Flying From
                        
                        
                        
                        
                        To Destination 
                        
                        
                        
                        
                        
                        
                                    
                    
                
                
            
        
    



</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@id=&quot;fadein&quot;]/section[@class=&quot;breadcrumb-area bread-bg-flights&quot;]/section[@class=&quot;container&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//body[@id='fadein']/section/section</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='How to Book'])[1]/following::section[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='FAQ'])[1]/following::section[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//section/section</value>
   </webElementXpaths>
</WebElementEntity>
