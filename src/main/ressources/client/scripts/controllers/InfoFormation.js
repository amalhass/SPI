/**
 * Created by DOSI on 13/02/2017.
 */
'use strict';



angular.module('app').controller('FormationInfoCtrl', ['$scope','$routeParams','ServiceFormation',function ($scope,$routeParams, ServiceFormation) {

    ServiceFormation.getOneFormation($routeParams.codeFormation,function (data) {
        $scope.formationInfo = data;
        console.log($scope.formationInfo);
    });


}]);