FROM node:stretch AS build

RUN npm install -g @angular/cli@8.3.20

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN npm install && ng build --prod

FROM nginx:alpine

RUN rm -rf /usr/share/nginx/html/*

COPY default.conf /etc/nginx/conf.d/default.conf

COPY --from=build /usr/src/app/dist/angular-tour-of-heroes /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
