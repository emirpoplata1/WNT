%ako je ime figure 'primjer.fig'
open ('primjer.fig');
h=gcf;
axesObjs=get (h, 'Children');
dataObjs=get (axesObjs, 'Children');
x_osa=get (dataObjs, 'XData'); %spasavanje u workspace
y_osa=get (dataObjs, 'YData'); %spasavanje u workspace