/**
 * Created by DOSI on 17/02/2017.
 */
'use strict';



angular.module('app').controller('EnseignantInfoCtrl', ['$scope','$routeParams','ServiceEnseignant',function ($scope,$routeParams, ServiceEnseignant) {

    ServiceEnseignant.getOneEnseignant($routeParams.noEnseignant,function (data) {
        $scope.enseignantInfo = data;
        console.log($scope.enseignantInfo);
    });


}]);