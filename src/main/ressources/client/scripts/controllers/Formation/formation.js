'use strict';


angular.module('app').controller('FormationCtrl', ['$scope','$routeParams','$http','ServiceFormation',function ($scope,$routeParams,$http, ServiceFormation) {

        $scope.formations = [];

        ServiceFormation.getAllFormation(function (data) {
            $scope.formations = data;

        });
    $scope.deleteFormation=function (codeFormation) {
        ServiceFormation.deleteFormation(codeFormation);
    }

    }]);