str='protok45.fig';
for i=45:5:95
    str=strrep(str, int2str(i), int2str(i+5))
    open (str);
    h=gcf;
    axesObjs=get (h, 'Children');
    dataObjs=get (axesObjs, 'Children');
    x_osa{i+5}=get (dataObjs, 'XData');
    y_osa{i+5}=get (dataObjs, 'YData');
    %x_osa{i+5}=x_osa{i+5}(1:1000);
    %y_osa{i+5}=y_osa{i+5}(1:1000);
    close (h);
end
br=0;
for i=50:5:100
    for j=1:1000
        if ((y_osa{i}(j)-y_osa{i}(j+1))>(3))
            pomocna(br+1)=x_osa{i}(j);
                br=br+1;
                if (br==2)
                    br=0;
                    break;
                end
        end
    end
    period(i)=pomocna(2)-pomocna(1);
        frekvencija(i)=1/period(i);
end
p=1;
for i=50:5:100
    postotci(p)=i;
    p=p+1;
end
p=1;
for i=50:5:100
    nova_frekvencija(p)=frekvencija(i);
    p=p+1;
end
%nova_frekvencija (10)=250;
plot (postotci,nova_frekvencija,'blue');
%cftool (postotci,nova_frekvencija);
%postotci_samples=50:0.1:100;
%for i=1:501
   % aproksimirana(i)=4.89*postotci_samples(i)-221.8;
%end
%hold on;
%plot (postotci_samples,aproksimirana,'red');
%legend ('eksperimentalna','linearizirana');
        
    
                
%for i=50:5:100
   % figure;
   % plot (x_osa{i},y_osa{i});
%end

%x_osa=get (dataObjs, 'XData'); %spasavanje u workspace
%y_osa=get (dataObjs, 'YData'); %spasavanje u workspace
% !!!!pazite samo da ovaj .m file spasite u folder gdje se nalazi .fig file







