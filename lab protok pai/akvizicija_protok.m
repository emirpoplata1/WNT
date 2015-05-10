AI = analoginput('winsound',0);
addchannel(AI,1);    
brsec=1;
samp=4000;
set(AI,'SampleRate',samp); 
set(AI, 'SamplesPerTrigger',brsec*samp);
 
start(AI);
 [data,t]=getdata(AI) 
     
        plot(t,data,'r'); 
        
        